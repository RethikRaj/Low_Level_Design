package InterfaceSegregationPrinciple.Example1.ProblematicCode;

public class AudioOnlyPlayer implements MediaPlayer {
    @Override
    public void playAudio(String audioFile) {
        System.out.println("Playing audio file: " + audioFile);
    }

    @Override
    public void stopAudio() {
        System.out.println("Audio stopped.");
    }

    @Override
    public void adjustAudioVolume(int volume) {
        System.out.println("Audio volume set to: " + volume);
    }

    // Methods this class should not care about: ( Forced to implement )
    @Override
    public void playVideo(String videoFile) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void stopVideo() {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void adjustVideoBrightness(int brightness) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void displaySubtitles(String subtitleFile) {
        throw new UnsupportedOperationException("Not supported.");
    }

}
