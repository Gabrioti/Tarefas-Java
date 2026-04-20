public class GoblinSaqueador extends Inimigo implements Recuperavel {
    
    public GoblinSaqueador() {
        // Nome, Vida, Força, Defesa, Mana, Stamina
        super("Goblin Saqueador", 40, 10, 8, 0, 10);
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        alvo.receberDano(getForca());
    }

    @Override
    public void recuperar() {
        setDefesa(getDefesa() + 5);
    }

    @Override
    public void tomarDecisao(PersonagemBase alvo, int numeroTurno) {
        // IA do Goblin: Se vida menor que 20 e sem escudo, ele tenta se defender
        if (getVida() < 20 && getDefesa() == 0) {
            Main.limparTela();
            this.desenharAcao(3, numeroTurno); // 3 = Arte de Recuperar
            recuperar();
        } else {
            Main.limparTela();
            this.desenharAcao(1, numeroTurno); // 1 = Arte de Ataque
            atacar(alvo);
        }
    }

    @Override
    public void desenharAcao(int acaoEscolhida, int numeroTurno) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        if (acaoEscolhida == 1) { // Ataque
            System.out.printf("║ %-58s ║\n", getNome() + " ataca com sua adaga enferrujada!");
            System.out.println("║                                                            ║");
            System.out.println("║            [ COLOQUE A ARTE DO GOBLIN AQUI ]               ║");
            System.out.println("║                                                            ║");
        } else if (acaoEscolhida == 3) { // Recuperar
            System.out.printf("║ %-58s ║\n", getNome() + " recua e junta sucata para defesa!");
            System.out.println("║                                                            ║");
            System.out.println("║         [ COLOQUE A ARTE DE DEFESA DO GOBLIN AQUI ]        ║");
            System.out.println("║                                                            ║");
        }
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }
}