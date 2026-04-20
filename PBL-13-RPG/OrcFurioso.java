public class OrcFurioso extends Inimigo {
    
    public OrcFurioso() {
        super("Orc Furioso", 70, 20, 12, 0, 20);
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        alvo.receberDano(getForca());
    }

    @Override
    public void tomarDecisao(PersonagemBase alvo, int numeroTurno) {
        // IA do Orc: Apenas atacar sem pensar!
        Main.limparTela();
        this.desenharAcao(1, numeroTurno); 
        atacar(alvo);
    }

    @Override
    public void desenharAcao(int acaoEscolhida, int numeroTurno) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        if (acaoEscolhida == 1) { // Ataque
            System.out.printf("║ %-58s ║\n", getNome() + " esmaga tudo com seu machado!");
            System.out.println("║                                                            ║");
            System.out.println("║              [ COLOQUE A ARTE DO ORC AQUI ]                ║");
            System.out.println("║                                                            ║");
        }
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }
}