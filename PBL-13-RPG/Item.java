public class Item {
    private String nome;
    private int bonusForca;
    private int bonusDefesa;
    private int preco; // NOVO ATRIBUTO

    // Construtor 1: Para os Drops dos Monstros (Não tem preço)
    public Item(String nome, int bonusForca, int bonusDefesa) {
        this.nome = nome;
        this.bonusForca = bonusForca;
        this.bonusDefesa = bonusDefesa;
        this.preco = 0; 
    }

    // Construtor 2: Para a Loja (Tem preço definido)
    public Item(String nome, int bonusForca, int bonusDefesa, int preco) {
        this.nome = nome;
        this.bonusForca = bonusForca;
        this.bonusDefesa = bonusDefesa;
        this.preco = preco;
    }

    // Getters
    public String getNome() { return nome; }
    public int getBonusForca() { return bonusForca; }
    public int getBonusDefesa() { return bonusDefesa; }
    public int getPreco() { return preco; } // NOVO GETTER
}