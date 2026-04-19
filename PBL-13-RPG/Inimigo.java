public class Inimigo extends PersonagemBase implements HabilidadeEspecial, Recuperavel {
    private boolean isBoss;

    public Inimigo(String nome, int vida, int defesa, int forca, int mana, int stamina, boolean isBoss) {
        super(nome, vida, defesa, forca, mana, stamina, 0);
        this.isBoss = isBoss;
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        System.out.println(getNome() + " ataca violentamente!");
        alvo.receberDano(getForca());
    }

    @Override
    public void usarHabilidade(PersonagemBase alvo) {
        System.out.println(getNome() + " usa um ATAQUE ESMAGADOR!");
        alvo.receberDano(getForca() * 2);
        setMana(getMana() - 10);
    }

    @Override
    public void recuperar() {
        System.out.println(getNome() + " regenera sua defesa!");
        restaurarDefesaTotal();
    }

    // Inteligência Artificial Simples
    public void tomarDecisao(PersonagemBase alvo) {
        if (getMana() >= 10 && isBoss) {
            Main.limparTela();
            this.desenharAcao(2, 0); // Chama a arte de habilidade do próprio inimigo
            usarHabilidade(alvo);
        } else if (getVida() < 20 && getDefesa() == 0) {
            Main.limparTela();
            this.desenharAcao(3,0); // Chama a arte de cura do próprio inimigo
            recuperar();
        } else {
            Main.limparTela();
            this.desenharAcao(1, 0); // Chama a arte de ataque do próprio inimigo
            atacar(alvo);
        }
    }

    @Override
    public void desenharAcao(int acaoEscolhida, int numeroTurno) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        switch (acaoEscolhida) {
            case 1: // Ataque
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com as GARRAS!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                break;
            case 2: // Habilidade Especial
            // --- FRAME 1 ---
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " usa ATAQUE FORTE!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                break;
            case 3: // Recuperar
                Main.limparTela();
                System.out.println("╔════════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-58s ║\n", getNome() + " O inimigo se RECUPERA!");
                System.out.println("╚════════════════════════════════════════════════════════════╝");
                break;
        }
    }
}