public class Guerreiro extends PersonagemBase implements HabilidadeEspecial, Recuperavel {

    private int PontosDeVidaGanhos = 5; // Quantidade de vida que o guerreiro recupera
    private int PontosDeEnergiaGanhos = 5; // Quantidade de energia que o guerreiro recupera

    public Guerreiro(String nome) {
        super(nome, 100, 20, 15, 50); // Vida, Ataque, Defesa e Energia específicos para o Guerreiro
    }

    @Override
    public void atacar(PersonagemBase alvo) {
        if (this.estaVivo()) {
            System.out.println(getNome() + " ataca " + alvo.getNome());
            alvo.receberDano(getAtaque());
        } else {
            System.out.println(getNome() + "não pode atacar.");
        }
    }

    @Override
    public void usarHabilidadeEspecial(PersonagemBase alvo) {
        if (this.estaVivo() && getEnergia() >= 20) {
            System.out.println(getNome() + " usa sua habilidade especial: Golpe Devastador!");

            alvo.receberDano(getAtaque() * 2); // Causa dano dobrado

            int novaEnergia = getEnergia() - 20; // Reduz a energia do guerreiro

            setEnergia(getEnergia() - 20); //método para atualizar a energia do guerreiro

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

            if (getVida() > 100) {
                setVida(100);
            }
            
            if (getEnergia() > 50) {
                setEnergia(50);  
            }  
        }        
    }
}