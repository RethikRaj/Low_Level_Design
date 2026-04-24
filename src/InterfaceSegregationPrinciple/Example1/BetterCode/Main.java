package InterfaceSegregationPrinciple.Example1.BetterCode;

public class Main {
    public static void main(String[] args) {
        AudioPlayerControls audioPlayerControls = new AudioOnlyPlayer();

        audioPlayerControls.playAudio("sampleaudio");
        audioPlayerControls.adjustAudioVolume(100);
    }
}
