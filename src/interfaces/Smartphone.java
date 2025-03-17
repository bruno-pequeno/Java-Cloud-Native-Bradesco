package interfaces;

public class Smartphone implements VideoPlayer,MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Telefone está tocando a música...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Telefone está pausando a música...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Telefone está parando a música...");
    }

    @Override
    public void playVideo() {
        System.out.println("Telefone está reproduzindo o vídeo...");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Telefone está pausando o vídeo...");
    }

    @Override
    public void stopVideo() {
        System.out.println("Telefone está parando o vídeo...");
    }
}
