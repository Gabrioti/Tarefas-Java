public class Mago extends PersonagemBase implements HabilidadeEspecial, Recuperavel {
    public Mago(String nome) {
        super(nome, 70, 20, 8, 50, 10, 0);
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        System.out.println(getNome() + " dispara um dardo mágico!");
        alvo.receberDano(getForca());
    }

    @Override
    public void usarHabilidade(PersonagemBase alvo) {
        if (getMana() >= 20) {
            System.out.println(getNome() + " conjura BOLA DE FOGO!");
            alvo.receberDano(getForca() * 3);
            setMana(getMana() - 20);
        } else {
            System.out.println("Mana insuficiente!");
        }
    }

    @Override
    public void recuperar() {
        System.out.println(getNome() + " canaliza energia mística!");
        setMana(getMana() + 20);
        restaurarDefesaTotal();
    }

    @Override
    public void desenharAcao(int acaoEscolhida) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        switch (acaoEscolhida) {
            case 1: // Ataque
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " faz uma Explosão!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                break;
            case 2: // Habilidade Especial
                // --- FRAME 1 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " conjura BOLA DE FOGO!");
                System.out.println("║                                                            ║");
                System.out.println("║                    ~~    .--.                              ║");
                System.out.println("║                ~~       /    \\                             ║");
                System.out.println("║            ~~          |      |                            ║");
                System.out.println("║                  ~~    \\    /                              ║");
                System.out.println("║                    ~~    '--'                              ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 2 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " conjura BOLA DE FOGO!");
                System.out.println("║                                                            ║");
                System.out.println("║                              ~~    .--.                    ║");
                System.out.println("║                          ~~       /    \\                   ║");
                System.out.println("║                      ~~          |      |                  ║");
                System.out.println("║                            ~~    \\    /                    ║");
                System.out.println("║                              ~~    '--'                    ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 3 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " conjura BOLA DE FOGO!");
                System.out.println("║                                                            ║");
                System.out.println("║                                        ~~    .--.          ║");
                System.out.println("║                                    ~~       /    \\         ║");
                System.out.println("║                                ~~          |      |        ║");
                System.out.println("║                                      ~~    \\    /          ║");
                System.out.println("║                                        ~~    '--'          ║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 4 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " conjura BOLA DE FOGO!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                  ~~    .--.║");
                System.out.println("║                                              ~~       /    ║");
                System.out.println("║                                          ~~          |     ║");
                System.out.println("║                                                ~~    \\    ║");
                System.out.println("║                                                  ~~    '--'║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 5 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " conjura BOLA DE FOGO!");
                System.out.println("║                                                          . ║");
                System.out.println("║                                                       .   °(║");
                System.out.println("║                                                   °      ( ║");
                System.out.println("║                                                      .   ( ║");
                System.out.println("║                                                         °( ║");
                System.out.println("║                                                      °    (║");
                System.out.println("║                                                          . ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 6 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " conjura BOLA DE FOGO!");
                System.out.println("║                                                            ║");
                System.out.println("║                                                     .   (  ║");
                System.out.println("║                                                       °  ( ║");
                System.out.println("║                                                    .    (  ║");
                System.out.println("║                                                     °    ( ║");
                System.out.println("║                                                         (  ║");
                System.out.println("║                                                      .     ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 7 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " conjura BOLA DE FOGO!");
                System.out.println("║                                                           .║");
                System.out.println("║                                                        °  (║");
                System.out.println("║                                                     .    ~(║");
                System.out.println("║                                                         ° (║");
                System.out.println("║                                                     .     (║");
                System.out.println("║                                                          ~(║");
                System.out.println("║                                                       °   (║");
                System.out.println("║                                                           .║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // --- FRAME 8 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " conjura BOLA DE FOGO!");
                System.out.println("║                                                           .║");
                System.out.println("║                                                           (║");
                System.out.println("║                                                          ~(║");
                System.out.println("║                                                          ~(║");
                System.out.println("║                                                          ~(║");
                System.out.println("║                                                          ~(║");
                System.out.println("║                                                           (║");
                System.out.println("║                                                            ║");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                break;
                
            case 3: // Recuperar
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " canaliza energia e se RECUPERA!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                break;
        }
    }
}