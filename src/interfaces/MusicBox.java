package interfaces;

public class MusicBox implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("MusicBox tocando a música...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("MusicBox pausando a música...");
    }

    @Override
    public void stopMusic() {
        System.out.println("MusicBox parando a música...");
    }
}
