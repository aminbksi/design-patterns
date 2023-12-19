
public class VideoPlayer implements VideoFormatPlayer {
    private VideoFormatPlayer videoAdapter;

    public VideoPlayer(VideoFormatPlayer videoAdapter) {
        this.videoAdapter = videoAdapter;
    }

    @Override
    public void play(String song) {
        this.videoAdapter.play(song);
    }
}
