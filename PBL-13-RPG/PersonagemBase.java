public abstract class PersonagemBase {

    private int ouro = 0; // Começa com zero ou um valor inicial
    private String nome;
    private int vidaMaxima;
    private int vida;
    private int defesaMaxima;
    private int staminaMaxima;
    private int defesa; // Funciona como barra de escudo
    private int forca;
    private int mana;
    private int stamina;
    private int ult;
    private int nivel;
    private int experiencia;

    public PersonagemBase(String nome, int vida, int defesa, int forca, int mana, int stamina, int ult) {
        this.nome = nome;
        this.vidaMaxima = vida;
        this.vida = vida;
        this.defesaMaxima = defesa;
        this.defesa = defesa;
        this.staminaMaxima = stamina;
        this.stamina = stamina;
        this.forca = forca;
        this.mana = mana;
        this.stamina = stamina;
        this.ult = ult;
        this.nivel = 1;
        this.experiencia = 0;
    }

    // Getters e Setters principais
    public int getOuro() { return ouro; }
    public void setOuro(int ouro) { this.ouro = ouro; }
    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }
    public int getDefesa() { return defesa; }
    public void setDefesa(int defesa) { this.defesa = defesa; }
    public int getForca() { return forca; }
    public void setForca(int forca) { this.forca = forca; }
    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }
    public int getStamina() { return stamina; }
    public void setStamina(int stamina) { this.stamina = stamina; }
    public int getUlt() { return ult; }
    public void setUlt(int ult) { this.ult = ult; }
    public int getNivel() { return nivel; }
    public int getExperiencia() {  return experiencia; }

    public void adicionarOuro(int quantidade) {
        this.ouro += quantidade;
        System.out.println("Você recebeu " + quantidade + " moedas de ouro!");
    }
    
    public void ganharExperiencia(int xp) {
        this.experiencia += xp;
        if (this.experiencia >= 100) {
            this.nivel++;
            this.experiencia = 0;
            this.forca += 5;
            this.vidaMaxima += 20;
            this.vida = this.vidaMaxima;
            System.out.println("\n*** " + this.nome + " SUBIU PARA O NÍVEL " + this.nivel + " ***");
        }
    }

    public void receberDano(int danoPuro) {
        // A defesa absorve o dano primeiro
        if (this.defesa > 0) {
            if (danoPuro <= this.defesa) {
                this.defesa -= danoPuro;
                danoPuro = 0;
            } else {
                danoPuro -= this.defesa;
                this.defesa = 0;
            }
        }
        
        if (danoPuro < 1 && this.defesa == 0) danoPuro = 1; // Dano mínimo

        this.vida -= danoPuro;
        if (this.vida < 0) this.vida = 0;
    }
    public void restaurarDefesaTotal() {
        this.defesa = this.defesaMaxima;
    }

    public void restaurarStaminaTotal() {
        this.stamina = this.staminaMaxima;
    }
    public boolean estaVivo() {
        return this.vida > 0;
    }
    public abstract void atacar(PersonagemBase alvo);
    
    public abstract void desenharAcao(int acaoEscolhida, int numeroTurno);
}