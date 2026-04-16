public class Guerreiro extends PersonagemBase implements HabilidadeEspecial, Recuperavel {
    public Guerreiro(String nome) {
        super(nome, 100, 50, 15, 10, 30, 0);
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        System.out.println(getNome() + "    Um golpe cortante foi feito!");
        alvo.receberDano(getForca());
    }

    @Override
    public void usarHabilidade(PersonagemBase alvo) {
        if (getStamina() >= 15) {
            System.out.println(getNome() + "    usa INVESTIDA BRUTAL!");
            alvo.receberDano(getForca() * 2);
            setStamina(getStamina() - 15);
        } else {
            System.out.println("    Stamina insuficiente!");
        }
    }

    @Override
    public void recuperar() {
        System.out.println(getNome() + "    Respirou fundo e se recuperou!");
        setVida(getVida() + 15);
        restaurarDefesaTotal();
    }

    @Override
    public void desenharAcao(int acaoEscolhida) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        switch (acaoEscolhida) {
            case 1: // Ataque

                // --- FRAME 5 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
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
                try { Thread.sleep(100); } catch (InterruptedException e) {} // 100 milissegundos
        
                // --- FRAME 1 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║               __                                           ║");
                System.out.println("║              / /                                           ║");
                System.out.println("║             / /                                            ║");
                System.out.println("║            / /                                             ║");
                System.out.println("║           / /                                              ║");
                System.out.println("║         (___)                                              ║");
                System.out.println("║         / /                                                ║");
                System.out.println("║        / /                                                 ║");
                System.out.println("║       (_/                                                  ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 2 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║      -----______  __                                       ║");
                System.out.println("║     -----______  / /                                       ║");
                System.out.println("║    -----______  / /                                        ║");
                System.out.println("║   -----_______ / /                                         ║");
                System.out.println("║  -----_______ / /                                          ║");
                System.out.println("║             (___)                                          ║");
                System.out.println("║             / /                                            ║");
                System.out.println("║            / /                                             ║");
                System.out.println("║           (_/                                              ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 3 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║      -----______  __                                       ║");
                System.out.println("║     -----______  / /                                       ║");
                System.out.println("║    -----______  / /                                        ║");
                System.out.println("║   -----_______ / /                                         ║");
                System.out.println("║  -----_______ / /                                          ║");
                System.out.println("║             (___)                                          ║");
                System.out.println("║             / /                                            ║");
                System.out.println("║            / /                                             ║");
                System.out.println("║           (_/                                              ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 4 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║           -----______  __                                  ║");
                System.out.println("║          -----______  / /                                  ║");
                System.out.println("║         -----______  / /                                   ║");
                System.out.println("║        -----_______ / /                                    ║");
                System.out.println("║       -----_______ / /                                     ║");
                System.out.println("║                  (___)                                     ║");
                System.out.println("║                  / /                                       ║");
                System.out.println("║                 / /                                        ║");
                System.out.println("║                (_/                                         ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 5 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║           -----______  __                                  ║");
                System.out.println("║          -----______  / /                                  ║");
                System.out.println("║         -----______  / /                                   ║");
                System.out.println("║        -----_______ / /                                    ║");
                System.out.println("║       -----_______ / /                                     ║");
                System.out.println("║                  (___)                                     ║");
                System.out.println("║                  / /                                       ║");
                System.out.println("║                 / /                                        ║");
                System.out.println("║                (_/                                         ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {} // 100 milissegundos

                break;
            case 2: // Habilidade Especial
                // --- FRAME 1 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║  - _    -                                                  ║");
                System.out.println("║ _  -  .  />_______________________________                 ║");
                System.out.println("║   - [####[]______________________________/                 ║");
                System.out.println("║ _  . _   \\>                                                ║");
                System.out.println("║ _ -                                                        ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 2 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║    -    .                                                  ║");
                System.out.println("║  _   .     />_______________________________               ║");
                System.out.println("║    -  [####[]______________________________/               ║");
                System.out.println("║-   .  _    \\>                                              ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 3 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║        -                                                   ║");
                System.out.println("║   - _    .    />_______________________________            ║");
                System.out.println("║   .  -   [####[]______________________________/            ║");
                System.out.println("║   _   _       \\>                                           ║");
                System.out.println("║     -    .                                                 ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 4 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║       _    ,                                               ║");
                System.out.println("║   _            />_______________________________           ║");
                System.out.println("║     _  -  [####[]______________________________/           ║");
                System.out.println("║          _     \\>                                          ║");
                System.out.println("║             .                                              ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");

                // --- FRAME 5 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║               _                                            ║");
                System.out.println("║      .     -     />_______________________________         ║");
                System.out.println("║         -   [####[]______________________________/         ║");
                System.out.println("║    .      _      \\>                                        ║");
                System.out.println("║                .                                           ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 6 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                 _                                          ║");
                System.out.println("║          _    -     />_______________________________      ║");
                System.out.println("║      ,      -  [####[]______________________________/      ║");
                System.out.println("║          -    .     \\>                                     ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 7 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                      _                                     ║");
                System.out.println("║            .     _  .  />_______________________________   ║");
                System.out.println("║         ,     -   [####[]______________________________/   ║");
                System.out.println("║           -     _      \\>                                  ║");
                System.out.println("║                       .                                    ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 8 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                       _                              .     ║");
                System.out.println("║                .   _     />_____________________________°__║");
                System.out.println("║         ,       -    [####[]______________________________/║");
                System.out.println("║              .    _      \\>                       °    .   ║");
                System.out.println("║                       -                                   °║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 9 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " avança com a ESPADA!");
                System.out.println("║                            .                             °.║");
                System.out.println("║                   ,     _   />_______________________°_____║");
                System.out.println("║                      -  [####[]____________________________║");
                System.out.println("║                .         _  \\>                   .       . ║");
                System.out.println("║                            .                             ° ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

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
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                break;
            case 3: // Recuperar
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                break;
        }
    }
}                                  