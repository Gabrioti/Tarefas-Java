import java.util.Scanner;

public class Main {
    public void nome(String nome) {
        super(nome, 0, 0, 0, 0); // O personagem principal não tem atributos específicos
    }

    private String TipoClasse;
    private int escolhaClasse;

    getTipoClasse() {
        return TipoClasse;
    }

    setTipoClasse(String tipoClasse) {
        TipoClasse = tipoClasse;
    }

    public void selecionarClasse(int classe) {
        switch (classe) {
            case 1:
                Guerreiro guerreiro = new Guerreiro("Aragorn");
                setTipoClasse(Guerreiro);
                break;
            case 2:
                Mago mago = new Mago("Gandalf");
                setTipoClasse(Mago);
                break;
            case 3:
                Arqueiro arqueiro = new Arqueiro("Legolas");
                setTipoClasse(Arqueiro); 
                break;
            default:
                System.out.println("Classe desconhecida. Por favor, escolha entre Guerreiro, Mago ou Arqueiro.");
        }
    }

    public static void main(String[] args) {
        InimigoBasico Orc = new InimigoBasico();
        InimigoBasico Demonio = new InimigoBasico("Demonio", 100, 20, 10, 25);
        InimigoBasico Vampiro = new InimigoBasico("Vampiro", 60, 10, 3, 30);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao RPG! Escolha sua classe: 1. Guerreiro, 2. Mago ou 3. Arqueiro.");
        escolhaClasse = Integer.parseInt(scanner.nextLine()); // Lê a escolha do jogador
        selecionarClasse(escolhaClasse); // Configura o personagem principal com base na escolha do jogador

        personagemBase personagemPrincipal = new getTipoClasse()(getNome(), getVida(), getAtaque(), getDefesa(), getEnergia());

        System.out.println("Batalha entre " + getNome() + ",O " + getTipoClasse() + " e " + inimigo.getNome() + " começa!");

        while (guerreiro.estaVivo() && inimigo.estaVivo()) {
            guerreiro.atacar(inimigo);
            if (inimigo.estaVivo()) {
                inimigo.tomarDecisao(guerreiro);
            }
            System.out.println();
        }

        if (guerreiro.estaVivo()) {
            System.out.println(guerreiro.getNome() + " venceu a batalha!");
        } else {
            System.out.println(inimigo.getNome() + " venceu a batalha!");
        }
    }
}