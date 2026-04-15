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
            this.desenharAcao(2); // Chama a arte de habilidade do próprio inimigo
            usarHabilidade(alvo);
        } else if (getVida() < 20 && getDefesa() == 0) {
            Main.limparTela();
            this.desenharAcao(3); // Chama a arte de cura do próprio inimigo
            recuperar();
        } else {
            Main.limparTela();
            this.desenharAcao(1); // Chama a arte de ataque do próprio inimigo
            atacar(alvo);
        }
    }

    @Override
    public void desenharAcao(int acaoEscolhida) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        switch (acaoEscolhida) {
            case 1: // Ataque
                System.out.printf("║ %-58s ║\n", getNome() + " ataca pesadamente com a ESPADA!");
                System.out.println("║                                                            ║");
                System.out.println("║           [ COLOQUE A ARTE DE ESPADA AQUI ]                ║");
                System.out.println("║                                                            ║");
                break;
            case 2: // Habilidade Especial
                System.out.printf("║ %-58s ║\n", getNome() + " usa INVESTIDA BRUTAL!");
                System.out.println("║                                                            ║");
                System.out.println("║         [ COLOQUE A ARTE DE HABILIDADE AQUI ]              ║");
                System.out.println("║                                                            ║");
                break;
            case 3: // Recuperar
                System.out.printf("║ %-58s ║\n", getNome() + " levanta o escudo e se RECUPERA!");
                System.out.println("║                                                            ║");
                System.out.println("║             [ COLOQUE A ARTE DE CURA AQUI ]                ║");
                System.out.println("║                                                            ║");
                break;
        }
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }
}