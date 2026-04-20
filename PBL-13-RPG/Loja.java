import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    public static void menuLoja(PersonagemBase heroi, ArrayList<Item> inventario, Scanner scanner) {
        boolean saindo = false;

        // O Catálogo é criado vazio e preenchido dependendo de quem entrou
        ArrayList<Item> catalogo = new ArrayList<>();

        // 1. ITENS UNIVERSAIS (Todos podem comprar)
        catalogo.add(new Item("Amuleto de Vitalidade", 5, 5, 70));
        catalogo.add(new Item("Anel do Protetor", 0, 10, 40));

        // 2. ITENS ESPECÍFICOS DE CLASSE
        if (heroi instanceof Guerreiro) {
            catalogo.add(new Item("Espada Montante de Aço", 15, 0, 80));
            catalogo.add(new Item("Armadura de Placas pesada", 0, 20, 100));
        } else if (heroi instanceof Mago) {
            catalogo.add(new Item("Cajado do Vazio", 18, 0, 80));
            catalogo.add(new Item("Manto Estrelado", 0, 15, 100));
        } else if (heroi instanceof Arqueiro) {
            catalogo.add(new Item("Arco Recurvo Élfico", 16, 0, 80));
            catalogo.add(new Item("Traje de Couro Furtivo", 0, 18, 100));
        }

        while (!saindo) {
            Main.limparTela();
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║                    LOJA DE EQUIPAMENTOS                    ║");
            System.out.println("╠════════════════════════════════════════════════════════════╣");
            System.out.printf("║ Seu Ouro: %-48d ║\n", heroi.getOuro());
            System.out.println("║------------------------------------------------------------║");
            
            for (int i = 0; i < catalogo.size(); i++) {
                Item item = catalogo.get(i);
                
                // Agora pegamos o preço diretamente do objeto Item
                String linhaItem = String.format("%d. %-24s | Atq:+%-2d | Def:+%-2d | $%3d", 
                                  (i + 1), item.getNome(), item.getBonusForca(), 
                                  item.getBonusDefesa(), item.getPreco());
                
                System.out.printf("║ %-58s ║\n", linhaItem);
            }
            
            System.out.printf("║ %-58s ║\n", ""); 
            System.out.printf("║ %-58s ║\n", "0. Sair da Loja");
            System.out.println("╚════════════════════════════════════════════════════════════╝");
            System.out.print("O que deseja comprar? ");

            try {
                int escolha = Integer.parseInt(scanner.nextLine());

                if (escolha == 0) {
                    saindo = true;
                } else if (escolha > 0 && escolha <= catalogo.size()) {
                    int indice = escolha - 1;
                    Item itemComprado = catalogo.get(indice);
                    int custo = itemComprado.getPreco(); // Preço vindo do item

                    if (heroi.getOuro() >= custo) {
                        heroi.setOuro(heroi.getOuro() - custo);
                        inventario.add(itemComprado);
                        
                        // Aplica os bônus
                        heroi.setForca(heroi.getForca() + itemComprado.getBonusForca());
                        heroi.setDefesa(heroi.getDefesa() + itemComprado.getBonusDefesa());

                        System.out.println("\n " + itemComprado.getNome() + " comprado com sucesso!");
                    } else {
                        System.out.println("\n Ouro insuficiente!");
                    }
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                } else {
                    System.out.println("Opção inválida.");
                    try { Thread.sleep(1000); } catch (InterruptedException e) {}
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas o número do item.");
                try { Thread.sleep(1000); } catch (InterruptedException ex) {}
            }
        }
    }
}