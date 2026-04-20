public class ReiDemonio extends Inimigo implements Recuperavel, HabilidadeEspecial {
    
    public ReiDemonio() {
        super("Rei Demônio (BOSS)", 150, 50, 20, 50, 50);
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        alvo.receberDano(getForca());
    }

    @Override
    public void usarHabilidade(PersonagemBase alvo) {
        if (getMana() >= 20) {
            alvo.receberDano(getForca() * 2);
            setMana(getMana() - 20);
        }
    }

    @Override
    public void recuperar() {
        setVida(getVida() + 25);
    }

    @Override
    public void tomarDecisao(PersonagemBase alvo, int numeroTurno) {
        // IA do Boss: Muito mais complexa!
        if (getMana() >= 20) {
            Main.limparTela();
            this.desenharAcao(2, numeroTurno); // Usa magia mortal
            usarHabilidade(alvo);
        } else if (getVida() < 50) {
            Main.limparTela();
            this.desenharAcao(3, numeroTurno); // Se cura se estiver morrendo
            recuperar();
        } else {
            Main.limparTela();
            this.desenharAcao(1, numeroTurno); // Ataque normal
            atacar(alvo);
        }
    }

    @Override
    public void desenharAcao(int acaoEscolhida, int numeroTurno) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        if (acaoEscolhida == 1) {
            System.out.printf("║ %-58s ║\n", getNome() + " perfura com a Lança das Sombras!");
            System.out.println("║             [ ARTE DE ATAQUE DO REI DEMÔNIO ]              ║");
        } else if (acaoEscolhida == 2) {
            System.out.printf("║ %-58s ║\n", getNome() + " conjura CHUVA DE METEOROS!");
            System.out.println("║             [ ARTE DE MAGIA DO REI DEMÔNIO ]               ║");
        } else if (acaoEscolhida == 3) {
            System.out.printf("║ %-58s ║\n", getNome() + " suga a energia vital da arena!");
            System.out.println("║              [ ARTE DE CURA DO REI DEMÔNIO ]               ║");
        }
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }
}