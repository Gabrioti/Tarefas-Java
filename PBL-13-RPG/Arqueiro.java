public class Arqueiro extends PersonagemBase implements HabilidadeEspecial, Recuperavel {

    /*
        O arqueiro é um personagem equilibrado, com boa mobilidade e ataques à distância.
        Ele tem uma habilidade especial que dispara uma sequência de flechas, causando dano em área. 
        Sua recuperação é moderada, permitindo que ele se mantenha no combate por mais tempo, mas sem a robustez do guerreiro ou a magia do mago. 
        Seus ataques e habilidades consomem tanto stamina quanto mana, incentivando o jogador a gerenciar ambos os recursos para maximizar seu potencial de dano.
    */

    public Arqueiro(String nome) {
        super(nome, 85, 30, 12, 20, 20);
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        System.out.println(getNome() + " atira uma flecha no alvo!");
        alvo.receberDano(getForca() + ((int)getForca() / getMana()));  
        //Dano base + bônus de acordo com a mana (quanto mais mana, mais dano). o (int) é para arredondar o bônus para baixo, evitando números quebrados.                                                
        setMana(getMana() - 1);
        setStamina(getStamina() - 1);
    }

    @Override
    public void usarHabilidade(PersonagemBase alvo) {
        if (getStamina() >= 10 && getMana() >= 10) {
            System.out.println(getNome() + " acertou varias flechas no alvo!");
            alvo.receberDano((int)(getForca() * 2.5));
            setStamina(getStamina() - 10);
            setMana(getMana() - 10);
        } else {
            System.out.println("Stamina ou Mana insuficientes!");
        }
    }

    @Override
    public void recuperar() {
        System.out.println(getNome() + " se recuperou!");
        setVida(getVida() + 10);
        restaurarDefesaTotal();
        restaurarStaminaTotal();
        restaurarManaTotal();
    }

    @Override
    public void desenharAcao(int acaoEscolhida, int numeroTurno) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        switch (acaoEscolhida) {
            case 1: // Ataque
                // --- FRAME 1 ---
                Main.limparTelaAnimacao();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║       ~                                                    ║");
                System.out.println("║    ~~   >>>>>>>_____________________\\`-._                  ║");
                System.out.println("║   ~~    >>>>>>>                     /.-'                   ║");
                System.out.println("║        ~                                                   ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(60); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 2 ---
                Main.limparTelaAnimacao();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║        ~                                                   ║");
                System.out.println("║   ~~      >>>>>>>_____________________\\`-._                ║");
                System.out.println("║     ~~    >>>>>>>                     /.-'                 ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(60); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 3 ---
                Main.limparTelaAnimacao();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║       ~                                                    ║");
                System.out.println("║            ~~  >>>>>>>_____________________\\`-._           ║");
                System.out.println("║    ~~          >>>>>>>                     /.-'            ║");
                System.out.println("║           ~                                                ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(60); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 4 ---
                Main.limparTelaAnimacao();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║       ~                                                    ║");
                System.out.println("║   ~        ~    ~~     >>>>>>>_____________________\\`-._   ║");
                System.out.println("║        ~          ~~   >>>>>>>                     /.-'    ║");
                System.out.println("║            ~                                               ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(60); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 5 ---
                Main.limparTelaAnimacao();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                          . ║");
                System.out.println("║                                                       ° . °║");
                System.out.println("║                             >>>>>>>_____________________\\`-║");
                System.out.println("║                             >>>>>>>                     /.-║");
                System.out.println("║                                                     .   °  ║");
                System.out.println("║                                                           .║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(60); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 6 ---
                Main.limparTelaAnimacao();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                        .   ║");
                System.out.println("║                                                   °   .   .║");
                System.out.println("║                              >>>>>>>_____________________\\`║");
                System.out.println("║                              >>>>>>>                     /°║");
                System.out.println("║                                                        .   ║");
                System.out.println("║                                                      °    .║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(60); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 7 ---
                Main.limparTelaAnimacao();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                               >>>>>>>_____________________\\║");
                System.out.println("║                               >>>>>>>                     /║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(60); } catch (InterruptedException e) {} // 100 milissegundos

                break;
            case 2: // Habilidade Especial
                  // --- FRAME 1 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║----->                                                      ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 2 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║------>                                                     ║");
                System.out.println("║>                                                           ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 3 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║>                                                           ║");
                System.out.println("║                                                            ║");
                System.out.println("║------->                                                    ║");
                System.out.println("║->                                                          ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 4 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║->                                                          ║");
                System.out.println("║                                                            ║");
                System.out.println("║-------->                                                   ║");
                System.out.println("║-->                                                         ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 5 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║-->                                                         ║");
                System.out.println("║                                                            ║");
                System.out.println("║--------->                                                  ║");
                System.out.println("║--->                                                        ║");
                System.out.println("║                                                            ║");
                System.out.println("║>                                                           ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 6 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║--->                                                        ║");
                System.out.println("║                                                            ║");
                System.out.println("║---------->                                                 ║");
                System.out.println("║---->                                                       ║");
                System.out.println("║                                                            ║");
                System.out.println("║->                                                          ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 6 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║---->                                                       ║");
                System.out.println("║                                                            ║");
                System.out.println("║----------->                                                ║");
                System.out.println("║----->                                                      ║");
                System.out.println("║                                                            ║");
                System.out.println("║-->                                                         ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 7 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║----->                                                      ║");
                System.out.println("║                                                            ║");
                System.out.println("║------------>                                               ║");
                System.out.println("║------>                                                     ║");
                System.out.println("║                                                            ║");
                System.out.println("║--->                                                        ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 8 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║------>                                                     ║");
                System.out.println("║                                                            ║");
                System.out.println("║------------->                                              ║");
                System.out.println("║------->                                                    ║");
                System.out.println("║>                                                           ║");
                System.out.println("║---->                                                       ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 9 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║------->                                                    ║");
                System.out.println("║                                                            ║");
                System.out.println("║-------------->                                             ║");
                System.out.println("║-------->                                                   ║");
                System.out.println("║->                                                          ║");
                System.out.println("║----->                                                      ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 10 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║-------->                                                   ║");
                System.out.println("║                                                            ║");
                System.out.println("║--------------->                                            ║");
                System.out.println("║--------->                                                  ║");
                System.out.println("║-->                                                         ║");
                System.out.println("║------>                                                     ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 11 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║--------->                                                  ║");
                System.out.println("║>                                                           ║");
                System.out.println("║---------------->                                           ║");
                System.out.println("║---------->                                                 ║");
                System.out.println("║--->                                                        ║");
                System.out.println("║------->                                                    ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 12 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║---------->                                                 ║");
                System.out.println("║->                                                          ║");
                System.out.println("║----------------->                                          ║");
                System.out.println("║----------->                                                ║");
                System.out.println("║---->                                                       ║");
                System.out.println("║-------->                                                   ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 13 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║----------->                                                ║");
                System.out.println("║-->                                                         ║");
                System.out.println("║------------------>                                         ║");
                System.out.println("║------------>                                               ║");
                System.out.println("║----->                                                      ║");
                System.out.println("║--------->                                                  ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 14 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║------------>                                               ║");
                System.out.println("║-->                                                         ║");
                System.out.println("║------------------->                                        ║");
                System.out.println("║------------->                                              ║");
                System.out.println("║------>                                                     ║");
                System.out.println("║---------->                                                 ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 15 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║------------->                                              ║");
                System.out.println("║--->                                                        ║");
                System.out.println("║-------------------->                                       ║");
                System.out.println("║-------------->                                             ║");
                System.out.println("║------->                                                    ║");
                System.out.println("║----------->                                                ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 16 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║-------------->                                             ║");
                System.out.println("║---->                                                       ║");
                System.out.println("║--------------------->                                      ║");
                System.out.println("║--------------->                                            ║");
                System.out.println("║-------->                                                   ║");
                System.out.println("║------------>                                               ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 17 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║--------------->                                            ║");
                System.out.println("║----->                                                      ║");
                System.out.println("║---------------------->                                     ║");
                System.out.println("║---------------->                                           ║");
                System.out.println("║--------->                                                  ║");
                System.out.println("║------------->                                              ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 18 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║---------------->                                           ║");
                System.out.println("║------>                                                     ║");
                System.out.println("║----------------------->                                    ║");
                System.out.println("║----------------->                                          ║");
                System.out.println("║---------->                                                 ║");
                System.out.println("║-------------->                                             ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 19 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║----------------->                                          ║");
                System.out.println("║------->                                                    ║");
                System.out.println("║>----------------------->                                   ║");
                System.out.println("║------------------>                                         ║");
                System.out.println("║----------->                                                ║");
                System.out.println("║--------------->                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 20 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║------------------>                                         ║");
                System.out.println("║-------->                                                   ║");
                System.out.println("║>>----------------------->                                  ║");
                System.out.println("║------------------->                                        ║");
                System.out.println("║------------>                                               ║");
                System.out.println("║---------------->                                           ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 21 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║------------------->                                        ║");
                System.out.println("║--------->                                                  ║");
                System.out.println("║>>>----------------------->                                 ║");
                System.out.println("║-------------------->                                       ║");
                System.out.println("║------------->                                              ║");
                System.out.println("║----------------->                                          ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 22 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║-------------------->                                       ║");
                System.out.println("║---------->                                                 ║");
                System.out.println("║>>>>----------------------->                                ║");
                System.out.println("║--------------------->                                      ║");
                System.out.println("║-------------->                                             ║");
                System.out.println("║------------------>                                         ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 23 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║--------------------->                                      ║");
                System.out.println("║----------->                                                ║");
                System.out.println("║>>>>>----------------------->                               ║");
                System.out.println("║---------------------->                                     ║");
                System.out.println("║--------------->                                            ║");
                System.out.println("║------------------->                                        ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 24 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║---------------------->                                     ║");
                System.out.println("║------------>                                               ║");
                System.out.println("║>>>>>>----------------------->                              ║");
                System.out.println("║----------------------->                                    ║");
                System.out.println("║---------------->                                           ║");
                System.out.println("║-------------------->                                       ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 25 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║----------------------->                                    ║");
                System.out.println("║------------->                                              ║");
                System.out.println("║ >>>>>>----------------------->                             ║");
                System.out.println("║>----------------------->                                   ║");
                System.out.println("║----------------->                                          ║");
                System.out.println("║--------------------->                                      ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 26 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║>----------------------->                                   ║");
                System.out.println("║-------------->                                             ║");
                System.out.println("║  >>>>>>----------------------->                            ║");
                System.out.println("║>>----------------------->                                  ║");
                System.out.println("║------------------>                                         ║");
                System.out.println("║---------------------->                                     ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 27 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║>>----------------------->                                  ║");
                System.out.println("║--------------->                                            ║");
                System.out.println("║   >>>>>>----------------------->                           ║");
                System.out.println("║>>>----------------------->                                 ║");
                System.out.println("║------------------->                                        ║");
                System.out.println("║----------------------->                                    ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 28 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║>>>----------------------->                                 ║");
                System.out.println("║---------------->                                           ║");
                System.out.println("║    >>>>>>----------------------->                          ║");
                System.out.println("║>>>>----------------------->                                ║");
                System.out.println("║>------------------->                                       ║");
                System.out.println("║------------------------>                                   ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 29 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║>>>>----------------------->                                ║");
                System.out.println("║----------------->                                          ║");
                System.out.println("║     >>>>>>----------------------->                         ║");
                System.out.println("║>>>>>----------------------->                               ║");
                System.out.println("║>>------------------>                                       ║");
                System.out.println("║>------------------------>                                  ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 30 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║>>>>>----------------------->                               ║");
                System.out.println("║------------------>                                         ║");
                System.out.println("║      >>>>>>----------------------->                        ║");
                System.out.println("║>>>>>>----------------------->                              ║");
                System.out.println("║>>>------------------>                                      ║");
                System.out.println("║>>------------------------>                                 ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 31 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║>>>>>>----------------------->                              ║");
                System.out.println("║------------------->                                        ║");
                System.out.println("║       >>>>>>----------------------->                       ║");
                System.out.println("║ >>>>>>----------------------->                             ║");
                System.out.println("║>>>>------------------>                                     ║");
                System.out.println("║>>>------------------------>                                ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 32 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║ >>>>>>----------------------->                             ║");
                System.out.println("║-------------------->                                       ║");
                System.out.println("║        >>>>>>----------------------->                      ║");
                System.out.println("║  >>>>>>----------------------->                            ║");
                System.out.println("║>>>>>------------------>                                    ║");
                System.out.println("║>>>>------------------------>                               ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 33 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║  >>>>>>----------------------->                            ║");
                System.out.println("║--------------------->                                      ║");
                System.out.println("║         >>>>>>----------------------->                     ║");
                System.out.println("║   >>>>>>----------------------->                           ║");
                System.out.println("║>>>>>>------------------>                                   ║");
                System.out.println("║>>>>>------------------------>                              ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 34 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║   >>>>>>----------------------->                           ║");
                System.out.println("║---------------------->                                     ║");
                System.out.println("║          >>>>>>----------------------->                    ║");
                System.out.println("║    >>>>>>----------------------->                          ║");
                System.out.println("║ >>>>>>------------------>                                  ║");
                System.out.println("║>>>>>>------------------------>                             ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 35 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║    >>>>>>----------------------->                          ║");
                System.out.println("║----------------------->                                    ║");
                System.out.println("║           >>>>>>----------------------->                   ║");
                System.out.println("║     >>>>>>----------------------->                         ║");
                System.out.println("║  >>>>>>------------------>                                 ║");
                System.out.println("║ >>>>>>------------------------>                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 36 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║     >>>>>>----------------------->                         ║");
                System.out.println("║>----------------------->                                   ║");
                System.out.println("║            >>>>>>----------------------->                  ║");
                System.out.println("║      >>>>>>----------------------->                        ║");
                System.out.println("║   >>>>>>------------------>                                ║");
                System.out.println("║  >>>>>>------------------------>                           ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 37 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║      >>>>>>----------------------->                        ║");
                System.out.println("║>>----------------------->                                  ║");
                System.out.println("║             >>>>>>----------------------->                 ║");
                System.out.println("║       >>>>>>----------------------->                       ║");
                System.out.println("║    >>>>>>------------------>                               ║");
                System.out.println("║   >>>>>>------------------------>                          ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 38 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║       >>>>>>----------------------->                       ║");
                System.out.println("║>>>----------------------->                                 ║");
                System.out.println("║              >>>>>>----------------------->                ║");
                System.out.println("║        >>>>>>----------------------->                      ║");
                System.out.println("║     >>>>>>------------------>                              ║");
                System.out.println("║    >>>>>>------------------------>                         ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 39 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║        >>>>>>----------------------->                      ║");
                System.out.println("║>>>>----------------------->                                ║");
                System.out.println("║               >>>>>>----------------------->               ║");
                System.out.println("║         >>>>>>----------------------->                     ║");
                System.out.println("║      >>>>>>------------------>                             ║");
                System.out.println("║     >>>>>>------------------------>                        ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 40 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║         >>>>>>----------------------->                     ║");
                System.out.println("║>>>>>----------------------->                               ║");
                System.out.println("║                >>>>>>----------------------->              ║");
                System.out.println("║          >>>>>>----------------------->                    ║");
                System.out.println("║       >>>>>>------------------>                            ║");
                System.out.println("║      >>>>>>------------------------>                       ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 41 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║          >>>>>>----------------------->                    ║");
                System.out.println("║ >>>>>----------------------->                              ║");
                System.out.println("║                 >>>>>>----------------------->             ║");
                System.out.println("║           >>>>>>----------------------->                   ║");
                System.out.println("║        >>>>>>------------------>                           ║");
                System.out.println("║       >>>>>>------------------------>                      ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 42 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║           >>>>>>----------------------->                   ║");
                System.out.println("║  >>>>>----------------------->                             ║");
                System.out.println("║                  >>>>>>----------------------->            ║");
                System.out.println("║            >>>>>>----------------------->                  ║");
                System.out.println("║         >>>>>>------------------>                          ║");
                System.out.println("║        >>>>>>------------------------>                     ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 43 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║            >>>>>>----------------------->                  ║");
                System.out.println("║   >>>>>----------------------->                            ║");
                System.out.println("║                   >>>>>>----------------------->           ║");
                System.out.println("║             >>>>>>----------------------->                 ║");
                System.out.println("║          >>>>>>------------------>                         ║");
                System.out.println("║         >>>>>>------------------------>                    ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 44 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║             >>>>>>----------------------->                 ║");
                System.out.println("║    >>>>>----------------------->                           ║");
                System.out.println("║                    >>>>>>----------------------->          ║");
                System.out.println("║              >>>>>>----------------------->                ║");
                System.out.println("║           >>>>>>------------------>                        ║");
                System.out.println("║          >>>>>>------------------------>                   ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 45 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║              >>>>>>----------------------->                ║");
                System.out.println("║     >>>>>----------------------->                          ║");
                System.out.println("║                     >>>>>>----------------------->         ║");
                System.out.println("║               >>>>>>----------------------->               ║");
                System.out.println("║            >>>>>>------------------>                       ║");
                System.out.println("║           >>>>>>------------------------>                  ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 46 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║               >>>>>>----------------------->               ║");
                System.out.println("║      >>>>>----------------------->                         ║");
                System.out.println("║                      >>>>>>----------------------->        ║");
                System.out.println("║                >>>>>>----------------------->              ║");
                System.out.println("║             >>>>>>------------------>                      ║");
                System.out.println("║            >>>>>>------------------------>                 ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 47 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                >>>>>>----------------------->              ║");
                System.out.println("║       >>>>>----------------------->                        ║");
                System.out.println("║                       >>>>>>----------------------->       ║");
                System.out.println("║                 >>>>>>----------------------->             ║");
                System.out.println("║              >>>>>>------------------>                     ║");
                System.out.println("║             >>>>>>------------------------>                ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 48 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                 >>>>>>----------------------->             ║");
                System.out.println("║        >>>>>----------------------->                       ║");
                System.out.println("║                        >>>>>>----------------------->      ║");
                System.out.println("║                  >>>>>>----------------------->            ║");
                System.out.println("║               >>>>>>------------------>                    ║");
                System.out.println("║              >>>>>>------------------------>               ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 49 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                  >>>>>>----------------------->            ║");
                System.out.println("║         >>>>>----------------------->                      ║");
                System.out.println("║                         >>>>>>----------------------->     ║");
                System.out.println("║                   >>>>>>----------------------->           ║");
                System.out.println("║                >>>>>>------------------>                   ║");
                System.out.println("║               >>>>>>------------------------>              ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 50 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                   >>>>>>----------------------->           ║");
                System.out.println("║          >>>>>----------------------->                     ║");
                System.out.println("║                          >>>>>>----------------------->    ║");
                System.out.println("║                    >>>>>>----------------------->          ║");
                System.out.println("║                 >>>>>>------------------>                  ║");
                System.out.println("║                >>>>>>------------------------>             ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 51 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                    >>>>>>----------------------->          ║");
                System.out.println("║           >>>>>----------------------->                    ║");
                System.out.println("║                           >>>>>>----------------------->   ║");
                System.out.println("║                     >>>>>>----------------------->         ║");
                System.out.println("║                  >>>>>>------------------>                 ║");
                System.out.println("║                 >>>>>>------------------------>            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos
                
                // --- FRAME 52 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                     >>>>>>----------------------->         ║");
                System.out.println("║            >>>>>----------------------->                   ║");
                System.out.println("║                            >>>>>>----------------------->  ║");
                System.out.println("║                      >>>>>>----------------------->        ║");
                System.out.println("║                   >>>>>>------------------>                ║");
                System.out.println("║                  >>>>>>------------------------>           ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 53 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                      >>>>>>----------------------->        ║");
                System.out.println("║             >>>>>----------------------->                  ║");
                System.out.println("║                             >>>>>>-----------------------> ║");
                System.out.println("║                       >>>>>>----------------------->       ║");
                System.out.println("║                    >>>>>>------------------>               ║");
                System.out.println("║                   >>>>>>------------------------>          ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 54 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                       >>>>>>----------------------->       ║");
                System.out.println("║              >>>>>----------------------->                 ║");
                System.out.println("║                              >>>>>>----------------------->║");
                System.out.println("║                        >>>>>>----------------------->      ║");
                System.out.println("║                     >>>>>>------------------>              ║");
                System.out.println("║                    >>>>>>------------------------>         ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 55 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                        >>>>>>----------------------->      ║");
                System.out.println("║               >>>>>----------------------->              .°║");
                System.out.println("║                               >>>>>>-----------------------║");
                System.out.println("║                         >>>>>>----------------------->   `.║");
                System.out.println("║                      >>>>>>------------------>             ║");
                System.out.println("║                     >>>>>>------------------------>        ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 56 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                         >>>>>>----------------------->     ║");
                System.out.println("║                >>>>>----------------------->               ║");
                System.out.println("║                                >>>>>>----------------------║");
                System.out.println("║                          >>>>>>----------------------->    ║");
                System.out.println("║                       >>>>>>------------------>            ║");
                System.out.println("║                      >>>>>>------------------------>       ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 57 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                          >>>>>>----------------------->    ║");
                System.out.println("║                 >>>>>----------------------->              ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                           >>>>>>----------------------->   ║");
                System.out.println("║                        >>>>>>------------------>           ║");
                System.out.println("║                       >>>>>>------------------------>      ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 58 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                           >>>>>>----------------------->   ║");
                System.out.println("║                  >>>>>----------------------->             ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                            >>>>>>----------------------->  ║");
                System.out.println("║                         >>>>>>------------------>          ║");
                System.out.println("║                        >>>>>>------------------------>     ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 59 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                            >>>>>>----------------------->  ║");
                System.out.println("║                   >>>>>----------------------->            ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                             >>>>>>-----------------------> ║");
                System.out.println("║                          >>>>>>------------------>         ║");
                System.out.println("║                         >>>>>>------------------------>    ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos
                
                // --- FRAME 60 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                             >>>>>>-----------------------> ║");
                System.out.println("║                    >>>>>----------------------->           ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                              >>>>>>----------------------->║");
                System.out.println("║                           >>>>>>------------------>        ║");
                System.out.println("║                          >>>>>>------------------------>   ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 61 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                              >>>>>>----------------------->║");
                System.out.println("║                     >>>>>----------------------->          ║");
                System.out.println("║                                 >>>>>>-------------------°.║");   //ok
                System.out.println("║                               >>>>>>-----------------------║");
                System.out.println("║                            >>>>>>------------------>     `°║");
                System.out.println("║                           >>>>>>------------------------>  ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 62 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                        . ° ║");
                System.out.println("║                               >>>>>>-----------------------║");
                System.out.println("║                       >>>>>----------------------->    ° . ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                             >>>>>>------------------>      ║");
                System.out.println("║                            >>>>>>------------------------> ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 63 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                        >>>>>----------------------->       ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                              >>>>>>------------------>     ║");
                System.out.println("║                             >>>>>>------------------------>║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 64 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                         >>>>>----------------------->      ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                               >>>>>>------------------> . °║");
                System.out.println("║                              >>>>>>------------------------║");
                System.out.println("║                                                         ° .║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 65 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                          >>>>>----------------------->     ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                                >>>>>>------------------>   ║");
                System.out.println("║                               >>>>>>-----------------------║");    //ok
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 66 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                           >>>>>----------------------->    ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                                 >>>>>>------------------>  ║");
                System.out.println("║                               >>>>>>-----------------------║");    //ok
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 67 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                            >>>>>----------------------->   ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                                  >>>>>>------------------> ║");
                System.out.println("║                               >>>>>>-----------------------║");    //ok
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 68 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                             >>>>>----------------------->  ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                                   >>>>>>------------------>║");
                System.out.println("║                               >>>>>>-----------------------║");    //ok
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 69 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                              >>>>>-----------------------> ║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>--------------------.°║");   //ok
                System.out.println("║                                    >>>>>>------------------║");
                System.out.println("║                               >>>>>>---------------------°`║");    //ok
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 70 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                               >>>>>----------------------->║");
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                                     >>>>>>-----------------║");   //ok
                System.out.println("║                               >>>>>>-----------------------║");    //ok
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 71 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>--------------------.°║");   //ok
                System.out.println("║                                >>>>>-----------------------║");
                System.out.println("║                                 >>>>>>-------------------°`║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                                     >>>>>>-----------------║");   //ok
                System.out.println("║                               >>>>>>-----------------------║");    //ok
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
               try { Thread.sleep(10); } catch (InterruptedException e) {} // 100 milissegundos

                // --- FRAME 72 ---
                Main.limparTelaAnimacao();                                                                                                              
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Dispara uma sequência de flechas!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                                  >>>>>---------------------║");   //ok
                System.out.println("║                                 >>>>>>---------------------║");   //ok
                System.out.println("║                                >>>>>>----------------------║");   //ok
                System.out.println("║                                     >>>>>>-----------------║");   //ok
                System.out.println("║                               >>>>>>-----------------------║");    //ok
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(1000); } catch (InterruptedException e) {} // 100 milissegundos

                break;
            
            case 3: // Recuperar
                Main.limparTelaAnimacao();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Usa a energia dos espiritos e se RECUPERA!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                break;
        }
    }
}