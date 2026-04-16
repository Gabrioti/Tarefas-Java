public class Item {
    private String nome;
    private int bonusForca;
    private int bonusDefesa;

    public Item(String nome, int bonusForca, int bonusDefesa) {
        this.nome = nome;
        this.bonusForca = bonusForca;
        this.bonusDefesa = bonusDefesa;
    }

    public String getNome() { return nome; }
    public int getBonusForca() { return bonusForca; }
    public int getBonusDefesa() { return bonusDefesa; }
}