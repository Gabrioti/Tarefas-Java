public abstract class PersonagemBase {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private int energia;

    public PersonagemBase(String nome, int vida, int ataque, int defesa, int energia ) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getEnergia() {
        return energia;
    }

    public void receberDano(int dano) {
        int danoFinal = dano - defesa;

        if (danoFinal < 1) {
            danoFinal = 1; // O dano não pode ser negativo
        }
        vida -= danoFinal;

        if (vida < 0) {
            vida = 0; // A vida não pode ser negativa
        }
    }
    
    public boolean estaVivo() {
        return vida > 0;  // Retorna true se a vida for maior que 0, indicando que o personagem está vivo
    }

    // Método abstrato: cada subclasse (Guerreiro, Mago...) terá que implementar do seu jeito
    public abstract void atacar(PersonagemBase alvo);

    
}