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
            "║                                             / |   _   |  \\ ║\n"+
            "║                                               |__| |__|    ║";



        // Imprime a moldura superior
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                       CAMPO DE BATALHA                     ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        
        // Imprime os personagens lado a lado de forma simplificada
        System.out.println(arteHeroi + arteInimigo);
        
        // Imprime os status dentro da moldura
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.printf("║ %-25s VS %-28s  ║\n", heroi.getNome(), inimigo.getNome()); 
        System.out.printf("║ Vida: %-3d | Escudo: %-3d      Vida: %-3d | Escudo: %-3d       ║\n", 
                          heroi.getVida(), heroi.getDefesa(), inimigo.getVida(), inimigo.getDefesa());
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }
}