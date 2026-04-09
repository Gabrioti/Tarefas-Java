public class InimigoBasico extends PersonagemBase implements HabilidadeEspecial, Recuperavel{

    private int PontosDeVidaGanhos = 4; // Quantidade de vida que o arqueiro recupera
    private int PontosDeEnergiaGanhos = 7; // Quantidade de energia que o arqueiro recupera

    public InimigoBasico(String nome) {
        super(nome, 80, 15, 10, 20); // Vida, Ataque, Defesa e Energia específicos para o Inimigo Básico
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        if (this.estaVivo()) {
            System.out.println(getNome() + " ataca " + alvo.getNome());
            alvo.receberDano(getAtaque());
        } else {
            System.out.println(getNome() + " não pode atacar.");
        }
    }
    
    @Override
    public void usarHabilidadeEspecial(PersonagemBase alvo) {
        if (this.estaVivo() && getEnergia() >= 10) {
            System.out.println(getNome() + " usa sua habilidade especial: Investida!");

            alvo.receberDano(getAtaque() * 2); // Causa dano dobrado

            setEnergia(getEnergia() - 10); // Reduz a energia do inimigo básico
        } else {
            System.out.println(getNome() + " não pode usar a habilidade especial.");
        }
    }

    @Override
    public void recuperar() {
        if (this.estaVivo()) {
            System.out.println(getNome() + " se recupera, restaurando parte de sua vida e energia.");

            setVida(getVida() + PontosDeVidaGanhos);// Lógica para recuperar vida
            setEnergia(getEnergia() + PontosDeEnergiaGanhos);// Lógica para recuperar energia

            if (getVida() > 80) {
                setVida(80);
            }

            if (getEnergia() > 20) {
                setEnergia(20);
            }
        }
    }

    public void tomarDecisao(PersonagemBase alvo) {
        if (this.estaVivo()) {
            if (getEnergia() >= 15) {
                usarHabilidadeEspecial(alvo);
                return; // O inimigo básico decide usar a habilidade especial se tiver energia suficiente
                
            } else if (getAtaque() > alvo.getDefesa()) {
                atacar(alvo);
                return; // O inimigo básico decide atacar se seu ataque for maior que a defesa do alvo  

            } else {
                recuperar(); // O inimigo básico tenta se recuperar após cada ação, se estiver vivo
                return; // O inimigo básico decide não atacar se o ataque não for eficaz
            }
        }
    }
}