import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Método para limpar o console usando códigos ANSI
    public static void limparTela() {
        // \033[H  -> Move o cursor para o topo
        // \033[2J -> Limpa a tela visível
        // \033[3J -> Limpa o histórico de rolagem (scrollback)
        System.out.print("\033[H\033[2J\033[3J");
        System.out.flush();
    }

    // Método para calibrar o tamanho da tela do jogador
    /*public static void telaDeCalibracao(Scanner scanner) {
        limparTela();
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                            ║");
        System.out.println("║                    TELA DE CALIBRAÇÃO                      ║");
        System.out.println("║                                                            ║");
        System.out.println("║   Para a melhor experiência e para que as artes não        ║");
        System.out.println("║   fiquem quebradas, por favor, redimensione a janela do    ║");
        System.out.println("║   seu terminal até que você consiga ver esta caixa         ║");
        System.out.println("║   inteira perfeitamente alinhada.                          ║");
        System.out.println("║                                                            ║");
        System.out.println("║   Quando a caixa estiver perfeita, aperte ENTER.           ║");
        System.out.println("║                                                            ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        scanner.nextLine(); // Trava o jogo aqui até o usuário apertar Enter
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonagemBase heroi = null;
        ArrayList<Item> inventario = new ArrayList<>();
        ArrayList<Inimigo> filaInimigos = new ArrayList<>();

        // ---> CHAMA A CALIBRAÇÃO AQUI <---
        //telaDeCalibracao(scanner);

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
            
            // ---> A MÁGICA DA REFATORAÇÃO ESTÁ AQUI <---
            // Chama o novo arquivo de combate. O código inteiro de luta está escondido lá agora!
            boolean heroiSobreviveu = Combate.iniciar(heroi, inimigo, scanner);

            // 4. RESULTADO DA BATALHA E FOGUEIRA
            if (!heroiSobreviveu) {
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
                heroi.adicionarOuro(60); // <--- dá ouro ao vencer
                heroi.restaurarDefesaTotal();
                heroi.restaurarStaminaTotal();
                
                Item drop = new Item("Relíquia da Batalha " + (i + 1), 3, 2);
                inventario.add(drop);
                
                // MENU DE INTERVALO (FOGUEIRA)
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
                    System.out.println("3 - Visitar a Loja");
                    System.out.print("Opção: ");
                    
                    try {
                        int escolhaMenu = Integer.parseInt(scanner.nextLine());
                        if (escolhaMenu == 1) {
                            System.out.println("\nPrepare-se...");
                            System.out.println("Pressione ENTER para chamar o próximo inimigo!");
                            scanner.nextLine(); 
                            noIntervalo = false; // Sai da fogueira e vai para a próxima luta
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
                        } else if (escolhaMenu == 3) {
                            Loja.menuLoja(heroi, inventario, scanner);
                        } else{
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