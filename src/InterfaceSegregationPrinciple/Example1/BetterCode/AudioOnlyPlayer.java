package InterfaceSegregationPrinciple.Example1.BetterCode;

public class AudioOnlyPlayer implements AudioPlayerControls{
    @Override
    public void playAudio(String audioFile) {
        System.out.println("ModernAudioPlayer: Playing audio - " + audioFile);
    }

    @Override
    public void stopAudio() {
        System.out.println("ModernAudioPlayer: Audio stopped.");
    }

    @Override
    public void adjustAudioVolume(int volume) {
        System.out.println("ModernAudioPlayer: Volume set to " + volume);
    }
}
