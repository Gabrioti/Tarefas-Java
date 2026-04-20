import java.util.Scanner;

public class Combate {

    // Método principal que gerencia a luta. Ele retorna 'true' se o herói vencer.
    public static boolean iniciar(PersonagemBase heroi, Inimigo inimigo, Scanner scanner) {
        
        int contadorTurno = 1; // Relógio da batalha começa no turno 1

        Main.limparTela();
        System.out.println("============================================================");
        System.out.println(" UM " + inimigo.getNome().toUpperCase() + " APARECEU!");
        System.out.println("============================================================");
        System.out.println("Pressione ENTER para iniciar o combate...");
        scanner.nextLine();

        // Loop principal da batalha: roda enquanto os dois estiverem vivos
        while (heroi.estaVivo() && inimigo.estaVivo()) {
            
            Main.limparTela();
            Art.desenharCena(heroi, inimigo); // Desenha a tela dividida com a vida
            
            boolean acaoValida = false;
            int acao = 0;

            // 1. Fase de Escolha do Jogador
            while (!acaoValida) {
                try {
                    System.out.println("\nTurno: " + contadorTurno);
                    System.out.println("\nO que você fará?");
                    System.out.println("1 - Atacar");
                    
                    // Mostra se a habilidade está pronta ou quantos ataques faltam
                    if (heroi.getContadorAtaques() >= 2) {
                        System.out.println("2 - Habilidade Especial [PRONTA!]");
                    } else {
                        System.out.println("2 - Habilidade Especial [Carregando: " + (2 - heroi.getContadorAtaques()) + " ataques restantes]");
                    }
                    System.out.println("3 - Recuperar");
                    System.out.print("Sua escolha: ");
                    acao = Integer.parseInt(scanner.nextLine());

                    // Verifica se pode usar a ação escolhida
                    if (acao == 1 || acao == 3) {
                        acaoValida = true;
                    } else if (acao == 2) {
                        if ((heroi.getContadorAtaques() >= 2 && heroi.getMana() >= 10) || (heroi.getContadorAtaques() >= 2 && heroi.getStamina() >= 10)) {
                            acaoValida = true; // Permite o uso!
                        } else {
                            System.out.println("\n A Habilidade ainda não está carregada!");
                        }
                    } else {
                        System.out.println("Ação inválida. Escolha 1, 2 ou 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Digite um número válido.");
                }
            }

            // 2. Fase de Animação do Herói
            Main.limparTela();

            // Passamos a ação e o turno atual para a classe saber qual arte desenhar
            heroi.desenharAcao(acao, contadorTurno);

            // 3. Fase de Execução do Dano do Herói
            switch (acao) {
                case 1:
                    heroi.atacar(inimigo);
                    heroi.adicionarAtaque(); // <--- SOMA 1 NO CONTADOR DE ATAQUE
                    break;
                case 2:
                    if (heroi instanceof HabilidadeEspecial) {
                        ((HabilidadeEspecial) heroi).usarHabilidade(inimigo);
                        heroi.zerarAtaques(); // <--- ZERA O CONTADOR APÓS USAR
                    }
                    break;
                case 3:
                    if (heroi instanceof Recuperavel) {
                        ((Recuperavel) heroi).recuperar();
                    }
                    break;
            }

            try { Thread.sleep(2500); } catch (InterruptedException e) {}

            System.out.println("------------------------------------------------------------");

            // 4. Fase do Inimigo (se ele não morreu com o seu ataque)
            if (inimigo.estaVivo()) {
                System.out.println("Turno do Inimigo:");
                // ---> ATUALIZE ESTA LINHA AQUI <---
                inimigo.tomarDecisao(heroi, contadorTurno); 
                System.out.println("============================================================");
                
                // Pausa de 3s para o jogador ler o que o inimigo fez antes da tela limpar
                try { Thread.sleep(3000); } catch (InterruptedException e) {}

            } else {
                // Inimigo Morreu!
                System.out.println(inimigo.getNome() + " caiu!");
                System.out.println("============================================================");
                
                System.out.println("Pressione ENTER para comemorar a vitória...");
                scanner.nextLine(); 
            }

            // O turno acabou, relógio avança!
            contadorTurno++; 
        }

        // Se o loop quebrou e o herói ainda tem vida, quer dizer que ele ganhou!
        return heroi.estaVivo(); 
    }

}