public class Arqueiro extends PersonagemBase implements HabilidadeEspecial, Recuperavel {

    private int PontosDeVidaGanhos = 4; // Quantidade de vida que o arqueiro recupera
    private int PontosDeEnergiaGanhos = 7; // Quantidade de energia que o arqueiro recupera

    public Arqueiro(String nome) {
        super(nome, 80, 15, 10, 70); // Vida, Ataque, Defesa e Energia específicos para o Arqueiro
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
        if (this.estaVivo() && getEnergia() >= 25) {
            System.out.println(getNome() + " usa sua habilidade especial: Tiro Certeiro!");

            alvo.receberDano((int)(getAtaque() * 2 + PontosDeEnergiaGanhos * 0.5)); // Causa dano dobrado + bônus de energia

            setEnergia(getEnergia() - 25); // Reduz a energia do arqueiro

        } else {
            System.out.println(getNome() + " não tem energia suficiente para usar a habilidade especial.");
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
            
            if (getEnergia() > 70) {
                setEnergia(70);  
            }  
        }        
    }
}