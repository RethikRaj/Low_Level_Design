package InterfaceSegregationPrinciple.Example1.BetterCode;

// Audio only capabilities
public interface AudioPlayerControls {
    void playAudio(String audioFile);
    void stopAudio();
    void adjustAudioVolume(int volume);
}
