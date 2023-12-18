import java.util.List;

class SequentialPlayStrategy extends SongPlayingStrategy {
    @Override
    public String selectNextSong(List<String> playlist, String currentSong) {
        if (currentSong == null) {
            return playlist.get(0);
        }
        int nextIndex = (playlist.indexOf(currentSong) + 1) % playlist.size();
        return playlist.get(nextIndex);
    }
}
