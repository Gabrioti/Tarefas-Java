import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Método para limpar o console usando códigos ANSI
    public static void limparTela() {
        // \033[H  -> Move o cursor para o topo
        // \033[2J -> Limpa a tela visível
        // \033[3J -> Limpa o histórico de rolagem (scrollback)
        System.out.print("\033[H\033[2J\033[3J");
        System.out.flush();// Garante que a limpeza seja aplicada imediatamente
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReprodutorDeAudio.tocarMusicaEmLoop("PBL-13-RPG/Sons/Ambiente.wav");
        loopDoJogo:
        while (true) {
        PersonagemBase heroi = null;
        Inimigo inimigo = null;
        ArrayList<Item> inventario = new ArrayList<>(); // Inventário do herói para armazenar itens coletados e comprados
        ArrayList<Inimigo> filaInimigos = new ArrayList<>(); // Fila de inimigos para o jogo, cada um com suas características e dificuldade


        // Configurando a fila de Inimigos (Fase 1, Fase 2, Fase 3, Fase 4 e Boss)
        filaInimigos.add(new GoblinSaqueador());
        filaInimigos.add(new OrcFurioso());
        filaInimigos.add(new GoblinSaqueador());
        filaInimigos.add(new OrcFurioso());
        filaInimigos.add(new ReiDemonio());


        //limparTela();
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                      BEM-VINDO AO RPG                      ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");

        System.out.print("Digite o nome do seu Herói: ");
        String nome = scanner.nextLine();
        
        while(nome.length() > 20) {
            System.out.println("O nome deve ter no máximo 20 caracteres. Tente novamente.");
            System.out.print("Digite o nome do seu Herói: ");
            nome = scanner.nextLine();
        }

        if (nome.trim().isEmpty()) {
            nome = "Herói Anônimo";
        }
        
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

        // 2. DISTRIBUIÇÃO DE PONTOS INICIAIS (LIMITADO A 5)
        limparTela();
        System.out.println("Hora de fortalecer seu herói recém-criado!");
        distribuirPontos(heroi, scanner);

        // 3. LOOP PRINCIPAL DO JOGO (PROGRESSÃO DE INIMIGOS)
        for (int i = 0; i < filaInimigos.size(); i++) {
            inimigo = filaInimigos.get(i);
            
            // Chama o novo arquivo de combate. O código inteiro de luta está lá agora!
            boolean heroiSobreviveu = Combate.iniciar(heroi, inimigo, scanner);

            // 4. RESULTADO DA BATALHA E FOGUEIRA
            if (!heroiSobreviveu) {
                limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.println("║                        GAME OVER                           ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                System.out.println("1 - Tentar Novamente com um novo Herói");
                System.out.println("2 - Sair do Jogo");
                int escMorte = Integer.parseInt(scanner.nextLine());
                if (escMorte == 1) {
                    continue loopDoJogo; // Volta lá para o topo, zerando o jogo!
                } else {
                    return; // Fecha o programa
                }
            } else {
                // Herói venceu
                int nivelAntes = heroi.getNivel(); // Guarda o nível antes de ganhar XP

                heroi.ganharExperiencia(50);
                heroi.adicionarOuro(60); // <--- dá ouro ao vencer
                heroi.restaurarDefesaTotal();
                

                if (heroi.getNivel() > nivelAntes) {
                    limparTela();
                    System.out.println(" LEVEL UP! Você ganhou novos pontos de atributo!");
                    distribuirPontos(heroi, scanner);
                    heroi.restaurarStaminaTotal(); // Restaura a Stamina/Mana ao subir de nível
                }
                
                Item drop = new Item("Relíquia da Batalha " + (i + 1), 3, 2);
                inventario.add(drop);
                
                // MENU DE INTERVALO (FOGUEIRA)
                boolean noIntervalo = true;
                while (noIntervalo) {
                    limparTela();
                    System.out.println("╔════════════════════════════════════════════════════════════╗");
                    System.out.println("║                     VITÓRIA NA BATALHA!                    ║");
                    System.out.println("╚════════════════════════════════════════════════════════════╝");
                    System.out.println("Você encontrou: " + drop.getNome());
                    System.out.println("\nO que deseja fazer?");
                    System.out.println("1 - Avançar para o próximo desafio");
                    System.out.println("2 - Ver Status e Inventário");
                    System.out.println("3 - Visitar a Loja");
                    System.out.println("4 - Abandonar Jornada (Recomeçar/Sair)"); // NOVA OPÇÃO
                    System.out.print("Opção: ");
                    
                    try {
                        int escolhaMenu = Integer.parseInt(scanner.nextLine());
                        if (escolhaMenu == 1) {
                            System.out.println("\nPrepare-se...");
                            System.out.println("Pressione ENTER para chamar o próximo inimigo!");
                             scanner.nextLine();
                            noIntervalo = false; // Sai da fogueira e vai para a próxima luta
                        } else if (escolhaMenu == 2) {
                            // Dentro do if (escolhaMenu == 2) no Main.java
                        limparTela();
                        System.out.println("╔════════════════════════════════════════════════════════════╗");
                        System.out.println("║                       PERFIL DO HERÓI                      ║");
                        System.out.println("╠════════════════════════════════════════════════════════════╣");

                        // Linhas de Status Principal
                        System.out.printf("║ Nome: %-25s | Nível: %-17d ║\n", heroi.getNome(), heroi.getNivel());
                        System.out.printf("║ XP: %d/100 %-47s ║\n", heroi.getExperiencia(), ""); 
                        System.out.printf("║ Ouro: %-52s ║\n", heroi.getOuro() + " moedas");
                        System.out.println("║------------------------------------------------------------║");

                        // Linhas de Atributos
                        System.out.printf("║ Vida: %-15d | Escudo: %-26d ║\n", heroi.getVida(), heroi.getDefesa());

                        String tipoEnergia = (heroi instanceof Mago) ? "Mana" : "Stamina";
                        int valorEnergia = (heroi instanceof Mago) ? heroi.getMana() : heroi.getStamina();
                        System.out.printf("║ %-8s: %-11d | Força: %-27d ║\n", tipoEnergia, valorEnergia, heroi.getForca());

                        System.out.println("╠════════════════════════════════════════════════════════════╣");
                        System.out.println("║                         INVENTÁRIO                         ║");
                        System.out.println("║------------------------------------------------------------║");

                        if (inventario.isEmpty()) {
                            System.out.println("║ (O inventário está vazio)                                  ║");
                        } else {
                            for (int j = 0; j < inventario.size(); j++) {
                                Item itemAtual = inventario.get(j);
                                String linhaItem = String.format("%d. %-20s (+Atq:%d, +Def:%d)", 
                                                    (j + 1), itemAtual.getNome(), itemAtual.getBonusForca(), itemAtual.getBonusDefesa());
                                System.out.printf("║ %-58s ║\n", linhaItem);
                            }
                        }

                        System.out.println("╚════════════════════════════════════════════════════════════╝");
                        System.out.println("Pressione ENTER para voltar ao menu...");
                        scanner.nextLine();

                        } else if (escolhaMenu == 3) {
                            Loja.menuLoja(heroi, inventario, scanner);
                        } else if (escolhaMenu == 4) {
                            System.out.println("\nTem certeza que deseja desistir?");
                            System.out.println("1 - Sim, recomeçar do zero com um novo herói");
                            System.out.println("2 - Sim, fechar o jogo");
                            System.out.println("3 - Não, voltar para a fogueira");
                            int esc = Integer.parseInt(scanner.nextLine());
                            
                            if (esc == 1) {
                                continue loopDoJogo; 
                            } else if (esc == 2) {
                                System.out.println("Obrigado por jogar!");
                                return; 
                            } else if (esc == 3) {
                                // NOVO: Dá um feedback visual para o jogador
                                System.out.println("Voltando para o calor da fogueira...");
                                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                            } else {
                                System.out.println("Opção inválida.");
                                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                            }
                        }
                    
                    }catch (NumberFormatException e) {
                        System.out.println("Erro: Digite um número válido.");
                    }
                }
            }
        }

        // Se o loop de inimigos acabar e o herói estiver vivo
        limparTela();
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                         PARABÉNS!                          ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.println(" Você derrotou o Boss final e salvou o reino!");
        
        System.out.println("\n1 - Jogar Novamente");
        System.out.println("2 - Sair do Jogo");
        int escolhaFinal = Integer.parseInt(scanner.nextLine());
        if (escolhaFinal == 1) {
            continue loopDoJogo;
        } else {
            return;
        }
    }
}

public static void distribuirPontos(PersonagemBase heroi, Scanner scanner) {
    int pontos = 5;
    System.out.println("\n╔════════════════════════════════════════════════════════════╗");
    System.out.println("║                DISTRIBUIÇÃO DE PONTOS (5 Pts)              ║");
    System.out.println("╚════════════════════════════════════════════════════════════╝");

    try {
        // 1. FORÇA
        System.out.print("Pontos para FORÇA (Atual " + heroi.getForca() + "): ");
        int f = Integer.parseInt(scanner.nextLine());
        if (f > pontos) f = pontos;
        if (f < 0) f = 0;
        heroi.setForca(heroi.getForca() + f);
        pontos -= f;

        // 2. DEFESA (Se ainda houver pontos)
        if (pontos > 0) {
            System.out.println("Pontos restantes: " + pontos);
            System.out.print("Pontos para DEFESA (Atual " + heroi.getDefesa() + "): ");
            int d = Integer.parseInt(scanner.nextLine());
            if (d > pontos) d = pontos;
            if (d < 0) d = 0;
            heroi.setDefesa(heroi.getDefesa() + d);
            pontos -= d;
        }

        // 3. VITALIDADE (O que sobrar)
        if (pontos > 0) {
            int bonusVida = pontos * 2;
            heroi.setVidaMaxima(heroi.getVidaMaxima() + bonusVida);
            heroi.setVida(heroi.getVida() + bonusVida);
            System.out.println("\n✨ Pontos de sobra: " + pontos);
            System.out.println("✨ Eles foram convertidos em +" + bonusVida + " de Vitalidade (Vida Máxima)!");
        }

    } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Pontos perdidos no abismo!");
    }
    
    System.out.println("Pressione ENTER para confirmar os novos atributos...");
    scanner.nextLine();
}

    // Método auxiliar para aplicar os atributos do item ao herói
    private static void aplicarItem(PersonagemBase heroi, Item item) {
        heroi.setForca(heroi.getForca() + item.getBonusForca());
        heroi.setDefesa(heroi.getDefesa() + item.getBonusDefesa());
    }
}