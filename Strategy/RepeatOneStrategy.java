import java.util.List;

class RepeatOneStrategy extends SongPlayingStrategy {
    @Override
    public String selectNextSong(List<String> playlist, String currentSong) {
        return currentSong;
    }
}
