public class Guerreiro extends PersonagemBase implements HabilidadeEspecial, Recuperavel {

    /*
        O guerreiro é um personagem robusto, com alta vida e defesa, mas com ataques mais simples.
        Ele tem uma habilidade especial que é um ataque poderoso, causando dano significativo ao inimigo.
        Seus ataques básicos são mais fracos, mas ele compensa isso com sua resistência e capacidade de se recuperar durante a batalha.
    */

    public Guerreiro(String nome) {
        super(nome, 100, 50, 15, 0, 30);
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        System.out.println(getNome() + " fez um golpe cortante no alvo!");
        alvo.receberDano(getForca());
        setStamina(getStamina() - 1);
    }

    @Override
    public void usarHabilidade(PersonagemBase alvo) {
        if (getStamina() >= 15) {
            System.out.println(getNome() + " O ataque acerta o alvo!");
            alvo.receberDano(getForca() * 2);
            setStamina(getStamina() - 15);
        } else {
            System.out.println(getNome() + " Stamina insuficiente!");
        }
    }

    @Override
    public void recuperar() {
        System.out.println(getNome() + " Respirou fundo e se recuperou!");
        setVida(getVida() + 15);
        restaurarDefesaTotal();
    }

    @Override
    public void desenharAcao(int acaoEscolhida, int numeroTurno) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        switch (acaoEscolhida) {
            case 1: // Ataque
                if (numeroTurno % 2 == 0) {

                // --- FRAME 1 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                           \\  |  /                          ║");
                System.out.println("║                             \\|/                            ║");
                System.out.println("║                               `                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                 

                // --- FRAME 2 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                         \\    |    /                        ║");
                System.out.println("║                           \\  |  /                          ║");
                System.out.println("║                             \\|/                            ║");
                System.out.println("║                               `                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                 

                // --- FRAME 3 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                       \\      |      /                      ║");
                System.out.println("║                         \\    |    /                        ║");
                System.out.println("║                           \\  |  /                          ║");
                System.out.println("║                             \\|/                            ║");
                System.out.println("║                               `                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                 

                // --- FRAME 4 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                     \\        |        /                    ║");
                System.out.println("║                       \\      |      /                      ║");
                System.out.println("║                         \\    |    /                        ║");
                System.out.println("║                           \\  |  /                          ║");
                System.out.println("║                             \\|/                            ║");
                System.out.println("║                               `                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                 

                // --- FRAME 5 ---
                Main.limparTela();                                                                                                             
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                    |         |         |                   ║");
                System.out.println("║                     \\        |        /                    ║");
                System.out.println("║                       \\      |      /                      ║");
                System.out.println("║                         \\    |    /                        ║");
                System.out.println("║                           \\  |  /                          ║");
                System.out.println("║                             \\|/                            ║");
                System.out.println("║                               `                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                 

                // --- FRAME 6 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                     /        |        \\                    ║");
                System.out.println("║                    |         |         |                   ║");
                System.out.println("║                     \\        |        /                    ║");
                System.out.println("║                       \\      |      /                      ║");
                System.out.println("║                         \\    |    /                        ║");
                System.out.println("║                           \\  |  /                          ║");
                System.out.println("║                             \\|/                            ║");
                System.out.println("║                               `                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                 

                // --- FRAME 7 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                      /       |       \\                     ║");
                System.out.println("║                     /        |        \\                    ║");
                System.out.println("║                    |         |         |                   ║");
                System.out.println("║                     \\        |        /                    ║");
                System.out.println("║                       \\      |      /                      ║");
                System.out.println("║                         \\    |    /                        ║");
                System.out.println("║                           \\  |  /                          ║");
                System.out.println("║                             \\|/                            ║");
                System.out.println("║                               `                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                

                // --- FRAME 8 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                       /      |      \\                      ║");
                System.out.println("║                      /       |       \\                     ║");
                System.out.println("║                     /        |        \\                    ║");
                System.out.println("║                    |         |         |                   ║");
                System.out.println("║                     \\        |        /                    ║");
                System.out.println("║                       \\      |      /                      ║");
                System.out.println("║                         \\    |    /                        ║");
                System.out.println("║                           \\  |  /                          ║");
                System.out.println("║                             \\|/                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                
                // --- FRAME 9 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                        /     |     \\                       ║");
                System.out.println("║                       /      |      \\                      ║");
                System.out.println("║                      /       |       \\                     ║");
                System.out.println("║                     /        |        \\                    ║");
                System.out.println("║                    |         |         |                   ║");
                System.out.println("║                     \\        |        /                    ║");
                System.out.println("║                       \\      |      /                      ║");
                System.out.println("║               °   .     \\    |    /   .  °                 ║");
                System.out.println("║                .     °    \\  |  /  °    .                  ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                

                // --- FRAME 10 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                         /    |    \\                        ║");
                System.out.println("║                        /     |     \\                       ║");
                System.out.println("║                       /      |      \\                      ║");
                System.out.println("║                      /       |       \\                     ║");
                System.out.println("║                     /        |        \\                    ║");
                System.out.println("║            °       |         |         |       °           ║");
                System.out.println("║             .       \\        |        /   .                ║");
                System.out.println("║                 °   . \\      |      /  °        .          ║");
                System.out.println("║           .     .       \\    |    /       .                ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                 

                // --- FRAME 11 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                          /   |   \\                         ║");
                System.out.println("║                         /    |    \\                        ║");
                System.out.println("║                        /     |     \\                       ║");
                System.out.println("║                       /      |      \\                      ║");
                System.out.println("║                      /       |       \\                     ║");
                System.out.println("║                     /        |        \\                    ║");
                System.out.println("║         °          |         |         |         .   °     ║");
                System.out.println("║         .    °.     \\        |        /     °              ║");
                System.out.println("║      .                \\      |      /            .   .     ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                

                // --- FRAME 12 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                    ||_____/  |  \\_____||                   ║");
                System.out.println("║                          /   |   \\                         ║");
                System.out.println("║                         /    |    \\                        ║");
                System.out.println("║                        /     |     \\                       ║");
                System.out.println("║                       /      |      \\                      ║");
                System.out.println("║                      /       |       \\                     ║");
                System.out.println("║                     /        |        \\                    ║");
                System.out.println("║      °  . °        |         |         |       °   .   °   ║");
                System.out.println("║    .                \\        |        /          .      .  ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                

                // --- FRAME 13 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                     ._____l_______l_____.                  ║");
                System.out.println("║                     ||_____/  |  \\_____||                  ║");
                System.out.println("║                           /   |   \\                        ║");
                System.out.println("║                          /    |    \\                       ║");
                System.out.println("║                         /     |     \\                      ║");
                System.out.println("║                        /      |      \\                     ║");
                System.out.println("║                       /       |       \\                    ║");
                System.out.println("║                      /        |        \\                   ║");
                System.out.println("║      .   °      .   |         |         |  .     °    . °  ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                

                // --- FRAME 14 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                          ___________                       ║");
                System.out.println("║                     ._____l_______l_____.                  ║");
                System.out.println("║                     ||_____/  |  \\_____||                  ║");
                System.out.println("║                           /   |   \\                        ║");
                System.out.println("║                          /    |    \\                       ║");
                System.out.println("║                         /     |     \\                      ║");
                System.out.println("║                        /      |      \\                     ║");
                System.out.println("║                       /       |       \\                    ║");
                System.out.println("║   .   .   .          /        |        \\    .   .     .    ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                

                // --- FRAME 15 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║                          ___________                       ║");
                System.out.println("║                     ._____l_______l_____.                  ║");
                System.out.println("║                     ||_____/  |  \\_____||                  ║");
                System.out.println("║                           /   |   \\                        ║");
                System.out.println("║                          /    |    \\                       ║");
                System.out.println("║                         /     |     \\                      ║");
                System.out.println("║                        /      |      \\                     ║");
                System.out.println("║                       /       |       \\                    ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
                 

                // --- FRAME 16 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                          ___________                       ║");
                System.out.println("║                     ._____l_______l_____.                  ║");
                System.out.println("║                     ||_____/  |  \\_____||                  ║");
                System.out.println("║                           /   |   \\                        ║");
                System.out.println("║                          /    |    \\                       ║");
                System.out.println("║                         /     |     \\                      ║");
                System.out.println("║                        /      |      \\                     ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos
            

                // --- FRAME 17 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                          ___________                       ║");
                System.out.println("║                     ._____l_______l_____.                  ║");
                System.out.println("║                     ||_____/  |  \\_____||                  ║");
                System.out.println("║                           /   |   \\                        ║");
                System.out.println("║                          /    |    \\                       ║");
                System.out.println("║                         /     |     \\                      ║");
                System.out.println("║                        /      |      \\                     ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(1000); } catch (InterruptedException e) {} // 100 milissegundos
                
                
                } else {

                // --- FRAME 1 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                 _                                          ║");
                System.out.println("║                / |                                         ║");
                System.out.println("║               / /                                          ║");
                System.out.println("║            \\/ /                                            ║");
                System.out.println("║             /\\/                                            ║");
                System.out.println("║             \\/\\                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 2 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                   _                                        ║");
                System.out.println("║                  / |                                       ║");
                System.out.println("║                 / /                                        ║");
                System.out.println("║              \\/ /                                          ║");
                System.out.println("║               /\\/                                          ║");
                System.out.println("║               \\/\\                                          ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 3 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                     _                                      ║");
                System.out.println("║                    / |                                     ║");
                System.out.println("║                   / /                                      ║");
                System.out.println("║                \\/ /                                        ║");
                System.out.println("║                 /\\/                                        ║");
                System.out.println("║                 \\/\\                                        ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 4 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                 _|__________¦                              ║");
                System.out.println("║                |_|_________/                               ║");
                System.out.println("║                  |                                         ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 5 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                   _|__________¦                            ║");
                System.out.println("║                  |_|_________/                             ║");
                System.out.println("║                    |                                       ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 6 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                               ¦                            ║");
                System.out.println("║                   _|__________¦                            ║");
                System.out.println("║                  |_|_________/                             ║");
                System.out.println("║                    |                                       ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 7 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                              ¦                             ║");
                System.out.println("║                 _|__________¦                              ║");
                System.out.println("║                |_|_________/                               ║");
                System.out.println("║                  |                                         ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 8 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                  /\\/                                       ║");
                System.out.println("║                  \\/\\                                       ║");
                System.out.println("║                  /\\ \\                                      ║");
                System.out.println("║                    \\ \\                                     ║");
                System.out.println("║                     \\_|                                    ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 9 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                /\\/                                         ║");
                System.out.println("║                \\/\\                                         ║");
                System.out.println("║                /\\ \\                                        ║");
                System.out.println("║                  \\ \\                                       ║");
                System.out.println("║                   \\_|                                      ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 10 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " prepara um CORTE DEVASTADOR!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║              /\\/                                           ║");
                System.out.println("║              \\/\\                                           ║");
                System.out.println("║              /\\ \\                                          ║");
                System.out.println("║                \\ \\                                         ║");
                System.out.println("║                 \\_|                                        ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(35); } catch (InterruptedException e) {} // 100 milissegundos

                break;
                }

                break;
            case 2: // Habilidade Especial
                // --- FRAME 1 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║          />_______________________________                 ║");
                System.out.println("║     [####[]______________________________/                 ║");
                System.out.println("║          \\>                                                ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 2 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║            />_______________________________               ║");
                System.out.println("║       [####[]______________________________/               ║");
                System.out.println("║            \\>                                              ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {}

                // --- FRAME 3 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║               />_______________________________            ║");
                System.out.println("║          [####[]______________________________/            ║");
                System.out.println("║               \\>                                           ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {}

                // --- FRAME 4 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║                />_______________________________           ║");
                System.out.println("║           [####[]______________________________/           ║");
                System.out.println("║                \\>                                          ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");

                // --- FRAME 5 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║                  />_______________________________         ║");
                System.out.println("║             [####[]______________________________/         ║");
                System.out.println("║                  \\>                                        ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {}

                // --- FRAME 6 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║                     />_______________________________      ║");
                System.out.println("║                [####[]______________________________/      ║");
                System.out.println("║                     \\>                                     ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {}

                // --- FRAME 7 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║                        />_______________________________   ║");
                System.out.println("║                   [####[]______________________________/   ║");
                System.out.println("║                        \\>                                  ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {}

                // --- FRAME 8 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                      .     ║");
                System.out.println("║                          />_____________________________°__║");
                System.out.println("║                      [####[]______________________________/║");
                System.out.println("║                          \\>                       °    .   ║");
                System.out.println("║                                                           °║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {}

                // --- FRAME 9 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                          °.║");
                System.out.println("║                             />_______________________°_____║");
                System.out.println("║                         [####[]____________________________║");
                System.out.println("║                             \\>                   .       . ║");
                System.out.println("║                                                          ° ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {}

                // --- FRAME 10 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                 />________________________(║");
                System.out.println("║                            [####[]_________________________║");
                System.out.println("║                                 \\>                        (║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}

                break;
            case 3: // Recuperar
                // --- FRAME 1 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 2 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 3 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("║                       |    ||    |                         ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 4 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("║                       |    ||    |                         ║");
                System.out.println("║                       |___o()o___|                         ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 5 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("║                       |    ||    |                         ║");
                System.out.println("║                       |___o()o___|                         ║");
                System.out.println("║                       |__((<>))__|                         ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 6 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("║                       |    ||    |                         ║");
                System.out.println("║                       |___o()o___|                         ║");
                System.out.println("║                       |__((<>))__|                         ║");
                System.out.println("║                       \\   o\\/o   /                         ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 7 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("║                       |    ||    |                         ║");
                System.out.println("║                       |___o()o___|                         ║");
                System.out.println("║                       |__((<>))__|                         ║");
                System.out.println("║                       \\   o\\/o   /                         ║");
                System.out.println("║                        \\   ||   /                          ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 8 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("║                       |    ||    |                         ║");
                System.out.println("║                       |___o()o___|                         ║");
                System.out.println("║                       |__((<>))__|                         ║");
                System.out.println("║                       \\   o\\/o   /                         ║");
                System.out.println("║                        \\   ||   /                          ║");
                System.out.println("║                         \\  ||  /                           ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 9 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("║                       |    ||    |                         ║");
                System.out.println("║                       |___o()o___|                         ║");
                System.out.println("║                       |__((<>))__|                         ║");
                System.out.println("║                       \\   o\\/o   /                         ║");
                System.out.println("║                        \\   ||   /                          ║");
                System.out.println("║                         \\  ||  /                           ║");
                System.out.println("║                          '.||.'                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(24); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 10 ---
                Main.limparTela();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║                       |`-._/\\_.-`|                         ║");
                System.out.println("║                       |    ||    |                         ║");
                System.out.println("║                       |___o()o___|                         ║");
                System.out.println("║                       |__((<>))__|                         ║");
                System.out.println("║                       \\   o\\/o   /                         ║");
                System.out.println("║                        \\   ||   /                          ║");
                System.out.println("║                         \\  ||  /                           ║");
                System.out.println("║                          '.||.'                            ║");
                System.out.println("║                            ``                              ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(1000); } catch (InterruptedException e) {} // 100 milissegundos

                break;
        }
    }
}                                  