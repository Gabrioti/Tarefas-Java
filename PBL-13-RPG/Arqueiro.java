public class Arqueiro extends PersonagemBase implements HabilidadeEspecial, Recuperavel {
    public Arqueiro(String nome) {
        super(nome, 85, 30, 12, 20, 20, 0);
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        System.out.println(getNome() + " atira uma flecha!");
        alvo.receberDano(getForca());
    }

    @Override
    public void usarHabilidade(PersonagemBase alvo) {
        if (getStamina() >= 10) {
            System.out.println(getNome() + " usa TIRO PERFURANTE!");
            alvo.receberDano((int)(getForca() * 2.5));
            setStamina(getStamina() - 10);
        } else {
            System.out.println("Stamina insuficiente!");
        }
    }

    @Override
    public void recuperar() {
        System.out.println(getNome() + " usa poção rápida e recua!");
        setVida(getVida() + 10);
        restaurarDefesaTotal();
    }

    @Override
    public void desenharAcao(int acaoEscolhida) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        switch (acaoEscolhida) {
            case 1: // Ataque
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca rapidamente com o ARCO!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                break;
            case 2: // Habilidade Especial
            // --- FRAME 1 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║       ~                                                    ║");
                System.out.println("║    ~~   >>>>>>>_____________________\\`-._                  ║");
                System.out.println("║   ~~    >>>>>>>                     /.-'                   ║");
                System.out.println("║        ~                                                   ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 2 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║        ~                                                   ║");
                System.out.println("║   ~~      >>>>>>>_____________________\\`-._                ║");
                System.out.println("║     ~~    >>>>>>>                     /.-'                 ║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 3 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║       ~                                                    ║");
                System.out.println("║            ~~  >>>>>>>_____________________\\`-._           ║");
                System.out.println("║    ~~          >>>>>>>                     /.-'            ║");
                System.out.println("║           ~                                                ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 4 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║       ~                                                    ║");
                System.out.println("║   ~        ~    ~~     >>>>>>>_____________________\\`-._   ║");
                System.out.println("║        ~          ~~   >>>>>>>                     /.-'    ║");
                System.out.println("║            ~                                               ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 5 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                          . ║");
                System.out.println("║                                                       ° . °║");
                System.out.println("║                             >>>>>>>_____________________\\`-║");
                System.out.println("║                             >>>>>>>                     /.-║");
                System.out.println("║                                                     .   °  ║");
                System.out.println("║                                                           .║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 6 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                        .   ║");
                System.out.println("║                                                   °   .   .║");
                System.out.println("║                              >>>>>>>_____________________\\`║");
                System.out.println("║                              >>>>>>>                     /°║");
                System.out.println("║                                                        .   ║");
                System.out.println("║                                                      °    .║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 7 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa FLECHA MÁGICA!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("║                               >>>>>>>_____________________\\║");
                System.out.println("║                               >>>>>>>                     /║");
                System.out.println("║                                                            ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                break;

            case 3: // Recuperar
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " Usa a energia dos espiritos e se RECUPERA!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                break;
        }
    }
}