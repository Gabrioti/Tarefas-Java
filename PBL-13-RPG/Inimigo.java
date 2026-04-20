public abstract class Inimigo extends PersonagemBase {
    
    // O construtor repassa os atributos base para o PersonagemBase
    public Inimigo(String nome, int vida, int forca, int defesa, int mana, int stamina) {
        super(nome, vida, forca, defesa, mana, stamina, 0); // 0 de XP, pois inimigos não sobem de nível
    }

    // Todo inimigo agora é OBRIGADO a ter sua própria IA de combate
    public abstract void tomarDecisao(PersonagemBase alvo, int numeroTurno);
}