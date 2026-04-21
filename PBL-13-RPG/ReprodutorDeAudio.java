import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class ReprodutorDeAudio {

    // Método estático para você chamar de qualquer lugar (ex: ReprodutorDeAudio.tocarSom("flecha.wav"))
    public static void tocarSom(String caminhoDoArquivo) {
        try {
            // Procura o arquivo de áudio no seu computador
            File arquivoSom = new File(caminhoDoArquivo);
            
            if (arquivoSom.exists()) {
                // Cria um fluxo de áudio e abre o "player" interno do Java (o Clip)
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(arquivoSom);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                
                // Dá o play! Ele toca o som de forma assíncrona (não trava o jogo)
                clip.start();
            } else {
                System.out.println(" Arquivo de som não encontrado: " + caminhoDoArquivo);
            }
        } catch (Exception e) {
            System.out.println(" Erro ao tocar o som: " + e.getMessage());
        }
    }

    // método feito especificamente para músicas de fundo
    public static void tocarMusicaEmLoop(String caminhoDoArquivo) {
        try {
            File arquivoSom = new File(caminhoDoArquivo);
            
            if (arquivoSom.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(arquivoSom);
                
                // --- O TRUQUE MÁGICO (Forçar conversão para o padrão do Java) ---
                javax.sound.sampled.AudioFormat baseFormat = audioInput.getFormat();
                javax.sound.sampled.AudioFormat decodedFormat = new javax.sound.sampled.AudioFormat(
                        javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED,
                        baseFormat.getSampleRate(),
                        16,
                        baseFormat.getChannels(),
                        baseFormat.getChannels() * 2,
                        baseFormat.getSampleRate(),
                        false // false = O Little-Endian que o Java tanto ama!
                );
                AudioInputStream decodedAudioInput = AudioSystem.getAudioInputStream(decodedFormat, audioInput);
                // ----------------------------------------------------------------
                
                Clip clip = AudioSystem.getClip();
                clip.open(decodedAudioInput); // Abre o áudio já convertido
                clip.loop(Clip.LOOP_CONTINUOUSLY); 
                clip.start();
            } else {
                System.out.println(" Música não encontrada: " + caminhoDoArquivo);
            }
        } catch (Exception e) {
            System.out.println(" Erro ao tocar a música: " + e.getMessage());
        }
    }
}