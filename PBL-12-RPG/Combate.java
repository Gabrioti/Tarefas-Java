import java.util.Scanner;

public class Combate {

    // Método estático para podermos chamá-r direto sem precisar dar "new Combate()"
    public static boolean iniciar(PersonagemBase heroi, Inimigo inimigo, Scanner scanner) {
        
        Main.limparTela(); // Usamos a limpeza de tela que já existe no Main
        System.out.println("============================================================");
        System.out.println(" UM " + inimigo.getNome().toUpperCase() + " APARECEU!");
        System.out.println("============================================================");
        System.out.println("Pressione ENTER para iniciar o combate...");
        scanner.nextLine();

        // Loop de turnos da batalha
        while (heroi.estaVivo() && inimigo.estaVivo()) {
            Main.limparTela();
            Art.desenharCena(heroi, inimigo);
            
            boolean acaoValida = false;
            int acao = 0;

            // Captura a ação do jogador
            while (!acaoValida) {
                try {
                    System.out.println("\nO que você fará?");
                    System.out.println("1 - Atacar");
                    System.out.println("2 - Habilidade Especial");
                    System.out.println("3 - Recuperar");
                    System.out.print("Sua escolha: ");
                    acao = Integer.parseInt(scanner.nextLine());

                    if (acao >= 1 && acao <= 3) {
                        acaoValida = true;
                    } else {
                        System.out.println("Ação inválida. Escolha 1, 2 ou 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Digite um número válido.");
                }
            }

            Main.limparTela();
            System.out.println("============================================================");
            System.out.println("                       TURNO ATUAL                          ");
            System.out.println("============================================================");

            // Chama a animação correspondente
            heroi.desenharAcao(acao);

            // Executa a ação do jogador
            switch (acao) {
                case 1:
                    heroi.atacar(inimigo);
                    break;
                case 2:
                    if (heroi instanceof HabilidadeEspecial) {
                        ((HabilidadeEspecial) heroi).usarHabilidade(inimigo);
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

            // Turno do inimigo (se ele sobreviveu ao ataque do jogador)
            if (inimigo.estaVivo()) {
                System.out.println("Turno do Inimigo:");
                inimigo.tomarDecisao(heroi);
                System.out.println("============================================================");
                
                // Pausa automática para ler a ação do inimigo
                try { Thread.sleep(3000); } catch (InterruptedException e) {}

            } else {
                System.out.println(inimigo.getNome() + " caiu!");
                System.out.println("============================================================");
                
                // Pausa manual com ENTER apenas na hora da vitória
                System.out.println("Pressione ENTER para comemorar a vitória...");
                scanner.nextLine(); 
            }
        }

        // Se o loop acabar e o herói ainda tiver vida, ele venceu.
        return heroi.estaVivo(); 
    }
}