public class Mago extends PersonagemBase implements HabilidadeEspecial, Recuperavel {

    private int PontosDeVidaGanhos = 3; // Quantidade de vida que o mago recupera
    private int PontosDeEnergiaGanhos = 10; // Quantidade de energia que o mago recupera

    public Mago(String nome) {
        super(nome, 60, 25, 10, 100); // Vida, Ataque, Defesa e Energia específicos para o Mago
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
        if (this.estaVivo() && getEnergia() >= 30) {
            System.out.println(getNome() + " usa sua habilidade especial: Bola de Fogo!");

            alvo.receberDano(getAtaque() * 3); // Causa dano triplo

            setEnergia(getEnergia() - 30); // Reduz a energia do mago

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

            if (getVida() > 60) {
                setVida(60);
            }
            
            if (getEnergia() > 100) {
                setEnergia(100);  
            }  
        }        
    }
}