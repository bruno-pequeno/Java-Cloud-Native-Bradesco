package interfaces;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        runVideo(computer);
        stopVideo(computer);

        System.out.println("=========== - ===========");

        Smartphone smartphone = new Smartphone();
        runMusic(smartphone);
        stopMusic(smartphone);

        System.out.println("=========== - ===========");

        MusicBox musicBox = new MusicBox();
        runMusic(musicBox);
        pauseMusic(musicBox);
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }

    public static void stopVideo(VideoPlayer videoPlayer){
        videoPlayer.stopVideo();
    }

    public static void stopMusic(MusicPlayer musicPlayer){
        musicPlayer.stopMusic();
    }

    public static void pauseMusic(MusicPlayer musicPlayer){
        musicPlayer.pauseMusic();
    }
}
