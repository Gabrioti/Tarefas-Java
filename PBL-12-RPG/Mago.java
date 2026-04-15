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