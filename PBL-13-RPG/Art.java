public class Art {

    public static void desenharCena(PersonagemBase heroi, PersonagemBase inimigo) {
        String arteHeroi = "";
        
        if (heroi instanceof Guerreiro) {
            arteHeroi =
            "║         (^_^)                                              ║\n"+
            "║        <)   ) ---[======>                                  ║\n" +
            "║       | |  |                                               ║\n" +
            "║         /  \\                                               ║\n" +
            "║        _/   \\_                                             ║\n";
        } else if (heroi instanceof Mago) {
            arteHeroi = 
            "║         ^   _                                              ║\n"+
            "║       _/_\\_ V                                              ║\n"+
            "║        O-O  |                                              ║ \n"+
            "║       / | \\_|                                              ║\n"+
            "║        / \\  |                                              ║\n"+
            "║       _/ \\_                                                ║\n";
        } else if (heroi instanceof Arqueiro) {
            arteHeroi = 
            "║     ^   O    (                                             ║\n"+
            "║     | < | >  \\\\                                            ║\n" +
            "║     |  / \\   //                                            ║\n" +
            "║     # _/ \\_  (                                             ║\n";
        }

        String arteInimigo = 
            "║                                                 __-__      ║\n"+
            "║                                                /     \\     ║\n"+
            "║                                               (       )    ║\n"+
            "║                                              /|       |\\   ║\n"+
            "║                                             / |   _   | \\  ║\n"+
            "║                                               |__| |__|    ║";



        // Imprime a moldura superior
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                       CAMPO DE BATALHA                     ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        
        // Imprime os personagens lado a lado de forma simplificada
        System.out.println(arteHeroi + arteInimigo);
        
        // No final do método desenharCena em Art.java
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.printf("║ %-25s VS %-28s  ║\n", heroi.getNome(), inimigo.getNome()); 
        System.out.printf("║ Vida: %-18d | Vida: %-25d ║\n", heroi.getVida(), inimigo.getVida());
        System.out.printf("║ Escudo: %-16d | Escudo: %-23d ║\n", heroi.getDefesa(), inimigo.getDefesa());

        // Lógica inteligente para Mana/Stamina
        String labelH = (heroi instanceof Mago) ? "Mana" : "Stam";
        String labelI = (inimigo.getMana() > 0) ? "Mana" : "Stam";
        int valH = (heroi instanceof Mago) ? heroi.getMana() : heroi.getStamina();
        int valI = (inimigo.getMana() > 0) ? inimigo.getMana() : inimigo.getStamina();

        System.out.printf("║ %-4s: %-18d | %-4s: %-25d ║\n", labelH, valH, labelI, valI);
        System.out.println("║------------------------------------------------------------║");
        System.out.printf("║ Seu Ouro: %-48d ║\n", heroi.getOuro());
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }
}