import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Método para limpar o console usando códigos ANSI
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonagemBase heroi = null;
        ArrayList<Item> inventario = new ArrayList<>();
        ArrayList<Inimigo> filaInimigos = new ArrayList<>();

        // Configurando a fila de Inimigos (Fase 1, Fase 2 e Boss)
        filaInimigos.add(new Inimigo("Goblin Saqueador", 40, 10, 8, 0, 10, false));
        filaInimigos.add(new Inimigo("Orc Furioso", 70, 20, 12, 0, 20, false));
        filaInimigos.add(new Inimigo("Rei Demônio (BOSS)", 150, 50, 20, 50, 50, true));

        limparTela();
        System.out.println("============================================================");
        System.out.println("                   BEM-VINDO AO RPG                         ");
        System.out.println("============================================================");
        
        System.out.print("Digite o nome do seu Herói: ");
        String nome = scanner.nextLine();

        // 1. ESCOLHA DE CLASSE
        boolean classeValida = false;
        while (!classeValida) {
            try {
                System.out.println("\nEscolha sua classe:");
                System.out.println("1 - Guerreiro");
                System.out.println("2 - Mago");
                System.out.println("3 - Arqueiro");
                System.out.print("Opção: ");
                
                int escolha = Integer.parseInt(scanner.nextLine());

                switch (escolha) {
                    case 1:
                        heroi = new Guerreiro(nome);
                        inventario.add(new Item("Espada Simples", 5, 0));
                        classeValida = true;
                        break;
                    case 2:
                        heroi = new Mago(nome);
                        inventario.add(new Item("Cajado Simples", 3, 0));
                        classeValida = true;
                        break;
                    case 3:
                        heroi = new Arqueiro(nome);
                        inventario.add(new Item("Arco Simples", 4, 0));
                        classeValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas o número correspondente à classe.");
            } finally {
                if (!classeValida) {
                    System.out.println("Aguardando entrada válida...");
                }
            }
        }

        // Equipa o item inicial automaticamente
        aplicarItem(heroi, inventario.get(0));

        // 2. DISTRIBUIÇÃO DE PONTOS INICIAIS
        int pontos = 10;
        limparTela();
        System.out.println("============================================================");
        System.out.println("Você tem " + pontos + " pontos para distribuir nos seus status!");
        System.out.println("============================================================");
        
        while (pontos > 0) {
            try {
                System.out.println("\nPontos restantes: " + pontos);
                System.out.print("Adicionar em Força (Atual: " + heroi.getForca() + "): ");
                int addF = Integer.parseInt(scanner.nextLine());
                if (addF > 0 && addF <= pontos) { 
                    heroi.setForca(heroi.getForca() + addF); 
                    pontos -= addF; 
                }

                if (pontos == 0) break;

                System.out.print("Adicionar em Defesa (Atual: " + heroi.getDefesa() + "): ");
                int addD = Integer.parseInt(scanner.nextLine());
                if (addD > 0 && addD <= pontos) { 
                    heroi.setDefesa(heroi.getDefesa() + addD); 
                    pontos -= addD; 
                }
                
                if (pontos > 0) {
                    System.out.println("Os " + pontos + " pontos restantes foram adicionados em Vida automaticamente.");
                    heroi.setVida(heroi.getVida() + (pontos * 2)); // 1 ponto = 2 de vida extra
                    pontos = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um valor numérico válido.");
            }
        }

        // 3. LOOP PRINCIPAL DO JOGO (PROGRESSÃO DE INIMIGOS)
        for (int i = 0; i < filaInimigos.size(); i++) {
            Inimigo inimigo = filaInimigos.get(i);
            
            limparTela();
            System.out.println("============================================================");
            System.out.println(" UM " + inimigo.getNome().toUpperCase() + " APARECEU!");
            System.out.println("============================================================");
            System.out.println("Pressione ENTER para iniciar o combate...");
            scanner.nextLine();

            // 4. LOOP DE BATALHA (TURNOS)
            while (heroi.estaVivo() && inimigo.estaVivo()) {
                limparTela();
                Art.desenharCena(heroi, inimigo);
                
                boolean acaoValida = false;
                int acao = 0;

                // Captura a ação do jogador
                while (!acaoValida) {
                    try {
                        System.out.println("\nO que você fará?");
                        System.out.println("1 - Atacar");
                        System.out.println("2 - Habilidade Especial");
                        System.out.println("3 - Recuperar");
                        System.out.print("Sua escolha: ");
                        acao = Integer.parseInt(scanner.nextLine());

                        if (acao >= 1 && acao <= 3) {
                            acaoValida = true;
                        } else {
                            System.out.println("Ação inválida. Escolha 1, 2 ou 3.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Digite um número válido.");
                    }
                }

                limparTela();
                System.out.println("============================================================");
                System.out.println("                       TURNO ATUAL                          ");
                System.out.println("============================================================");

                heroi.desenharAcao(acao);

                // Executa a ação do jogador
                switch (acao) {
                    case 1:
                        heroi.atacar(inimigo);
                        break;
                    case 2:
                        if (heroi instanceof HabilidadeEspecial) {
                            ((HabilidadeEspecial) heroi).usarHabilidade(inimigo);
                        }
                        break;
                    case 3:
                        if (heroi instanceof Recuperavel) {
                            ((Recuperavel) heroi).recuperar();
                        }
                        break;
                }

                System.out.println("------------------------------------------------------------");

                // Turno do inimigo (se ele sobreviveu ao ataque do jogador)
                if (inimigo.estaVivo()) {
                    System.out.println("Turno do Inimigo:");
                    inimigo.tomarDecisao(heroi);
                    System.out.println("============================================================");
                    
                    // Pausa automática de 3 segundos para dar tempo de ler o que o inimigo fez
                    try {
                        Thread.sleep(3000); 
                    } catch (InterruptedException e) {}

                } else {
                    System.out.println(inimigo.getNome() + " caiu!");
                    System.out.println("============================================================");
                    
                    // A pausa manual com ENTER acontece APENAS quando o inimigo é derrotado
                    System.out.println("Pressione ENTER para comemorar a vitória...");
                    scanner.nextLine(); 
                }
            }

            // 5. RESULTADO DA BATALHA
            if (!heroi.estaVivo()) {
                limparTela();
                System.out.println("============================================================");
                System.out.println("                        GAME OVER                           ");
                System.out.println("============================================================");
                System.out.println(heroi.getNome() + " foi derrotado em batalha.");
                scanner.close();
                return; // Encerra o jogo
            } else {
                // Herói venceu
                heroi.ganharExperiencia(50);
                heroi.restaurarDefesaTotal();
                
                Item drop = new Item("Relíquia da Batalha " + (i + 1), 3, 2);
                inventario.add(drop);
                
                // 6. MENU DE INTERVALO (FOGUEIRA)
                boolean noIntervalo = true;
                while (noIntervalo) {
                    limparTela();
                    System.out.println("============================================================");
                    System.out.println("                   VITÓRIA NA BATALHA!                      ");
                    System.out.println("============================================================");
                    System.out.println("Você encontrou: " + drop.getNome());
                    System.out.println("\nO que deseja fazer?");
                    System.out.println("1 - Avançar para o próximo desafio");
                    System.out.println("2 - Ver Status e Inventário");
                    System.out.print("Opção: ");
                    
                    try {
                        int escolhaMenu = Integer.parseInt(scanner.nextLine());
                        if (escolhaMenu == 1) {
                            noIntervalo = false; // Sai do loop e vai para a próxima luta
                        } else if (escolhaMenu == 2) {
                            limparTela();
                            System.out.println("============================================================");
                            System.out.println("                       SEUS STATUS                          ");
                            System.out.println("============================================================");
                            System.out.println("Nível: " + heroi.getNivel() + " | Experiência: " + heroi.getExperiencia() + "/100");
                            System.out.println("Vida Atual: " + heroi.getVida() + " | Escudo: " + heroi.getDefesa());
                            System.out.println("Força Total: " + heroi.getForca() + " | Mana/Stamina: " + heroi.getMana() + "/" + heroi.getStamina());
                            
                            System.out.println("\n----------------------- INVENTÁRIO -----------------------");
                            for (int j = 0; j < inventario.size(); j++) {
                                Item itemAtual = inventario.get(j);
                                System.out.println((j + 1) + ". " + itemAtual.getNome() + " (+Força: " + itemAtual.getBonusForca() + ", +Def: " + itemAtual.getBonusDefesa() + ")");
                            }
                            System.out.println("============================================================");
                            System.out.println("Pressione ENTER para voltar ao menu...");
                            scanner.nextLine();
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Digite um número válido.");
                    }
                }
            }
        }

        // Se o loop de inimigos acabar e o herói estiver vivo
        limparTela();
        System.out.println("============================================================");
        System.out.println("                        PARABÉNS!                           ");
        System.out.println("============================================================");
        System.out.println("Você derrotou o Boss final e salvou o reino!");
        System.out.println("Obrigado por jogar.");
        scanner.close();
    }

    // Método auxiliar para aplicar os atributos do item ao herói
    private static void aplicarItem(PersonagemBase heroi, Item item) {
        heroi.setForca(heroi.getForca() + item.getBonusForca());
        heroi.setDefesa(heroi.getDefesa() + item.getBonusDefesa());
    }
}