package interfaces;

public class Computer implements MusicPlayer, VideoPlayer {
        @Override
        public void playMusic() {
            System.out.println("Computador está tocando a música...");
        }

        @Override
        public void pauseMusic() {
            System.out.println("Computador está pausando a música...");
        }

        @Override
        public void stopMusic() {
            System.out.println("Computador está parando a música...");
        }

        @Override
        public void playVideo() {
            System.out.println("Computador está reproduzindo o vídeo...");
        }

        @Override
        public void pauseVideo() {
            System.out.println("Computador está pausando o vídeo...");
        }

        @Override
        public void stopVideo() {
            System.out.println("Computador está parando o vídeo...");
        }
}
