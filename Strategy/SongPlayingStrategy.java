import java.util.List;

public abstract class SongPlayingStrategy {
    String selectNextSong(List<String> playlist, String currentSong){
        return currentSong;
    }
}
