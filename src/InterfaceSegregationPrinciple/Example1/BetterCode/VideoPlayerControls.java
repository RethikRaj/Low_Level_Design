package InterfaceSegregationPrinciple.Example1.BetterCode;

// Video only capabilities
public interface VideoPlayerControls {
    void playVideo(String videoFile);
    void stopVideo();
    void adjustVideoBrightness(int brightness);
    void displaySubtitles(String subtitleFile);
}
