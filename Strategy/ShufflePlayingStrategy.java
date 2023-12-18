import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class ShufflePlayStrategy extends SongPlayingStrategy {
    private Set<String> playedSongs = new HashSet<>();
    private Random random = new Random();

    @Override
    public String selectNextSong(List<String> playlist, String currentSong) {
        if (playedSongs.size() == playlist.size()) {
            playedSongs.clear(); // Reset once all songs have been played.
        }
        String nextSong = currentSong;
        while (nextSong == null || playedSongs.contains(nextSong) || nextSong.equals(currentSong)) {
            nextSong = playlist.get(random.nextInt(playlist.size()));
        }
        playedSongs.add(nextSong);
        return nextSong;
    }
}
