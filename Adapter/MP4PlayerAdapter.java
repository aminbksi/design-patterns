
public class MP4PlayerAdapter implements VideoFormatPlayer {
    private MP4Player mp4Player;

    public MP4PlayerAdapter(MP4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String song) {
        this.mp4Player.playMP4(song);
    }
}