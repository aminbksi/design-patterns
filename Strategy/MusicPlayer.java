import java.util.List;

class MusicPlayer {
    private List<String> playlist;
    private String currentSong;
    private SongPlayingStrategy strategy;

    public MusicPlayer(List<String> playlist) {
        this.playlist = playlist;
        this.strategy = new SequentialPlayStrategy();
    }

    public void setStrategy(SongPlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void playNext() {
        currentSong = strategy.selectNextSong(playlist, currentSong);
        System.out.println("Playing: " + currentSong);
    }
}
