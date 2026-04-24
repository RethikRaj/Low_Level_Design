package InterfaceSegregationPrinciple.Example1.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mp = new AudioOnlyPlayer();

        mp.playAudio("sampleaudio.mp3");

        // mp.playVideo("samplevideo.mp4"); // Error at runtime

    }
}
