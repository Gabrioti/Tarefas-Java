import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    public static void menuLoja(PersonagemBase heroi, ArrayList<Item> inventario, Scanner scanner) {
        boolean saindo = false;

        // Lista de itens disponíveis para venda
        ArrayList<Item> catalogo = new ArrayList<>();
        catalogo.add(new Item("Espada de Aço", 10, 0));      // Custo sugerido: 50
        catalogo.add(new Item("Escudo de Carvalho", 0, 15));  // Custo sugerido: 40
        catalogo.add(new Item("Amuleto de Vitalidade", 5, 5)); // Custo sugerido: 70

        int[] precos = {50, 40, 70};

        while (!saindo) {
            Main.limparTela();
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║                    LOJA DE EQUIPAMENTOS                    ║");
            System.out.println("╠════════════════════════════════════════════════════════════╣");
            
            // Imprime o ouro com a parede esquerda e direita fixas
            System.out.printf("║ Seu Ouro: %-48d ║\n", heroi.getOuro());
            System.out.println("║------------------------------------------------------------║");
            
            for (int i = 0; i < catalogo.size(); i++) {
                Item item = catalogo.get(i);
                
                // Montamos a frase do item calculando os espaços para não passar de 58 caracteres
                String linhaItem = String.format("%d. %-21s | Atq:+%-2d | Def:+%-2d | $%3d", 
                                  (i + 1), item.getNome(), item.getBonusForca(), 
                                  item.getBonusDefesa(), precos[i]);
                
                // Imprimimos a linha já com as paredes
                System.out.printf("║ %-58s ║\n", linhaItem);
            }
            
            System.out.printf("║ %-58s ║\n", ""); // Linha em branco para dar um respiro
            System.out.printf("║ %-58s ║\n", "0. Sair da Loja");
            System.out.println("╚════════════════════════════════════════════════════════════╝");
            System.out.print("O que deseja comprar? ");

            try {
                int escolha = Integer.parseInt(scanner.nextLine());

                if (escolha == 0) {
                    saindo = true;
                } else if (escolha > 0 && escolha <= catalogo.size()) {
                    int indice = escolha - 1;
                    int custo = precos[indice];
                    Item itemComprado = catalogo.get(indice);

                    if (heroi.getOuro() >= custo) {
                        heroi.setOuro(heroi.getOuro() - custo);
                        inventario.add(itemComprado);
                        
                        // Aplica os bônus do item imediatamente
                        heroi.setForca(heroi.getForca() + itemComprado.getBonusForca());
                        heroi.setDefesa(heroi.getDefesa() + itemComprado.getBonusDefesa());

                        System.out.println("\n" + itemComprado.getNome() + " comprado com sucesso!");
                    } else {
                        System.out.println("\nOuro insuficiente!");
                    }
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
            }
        }
    }
}