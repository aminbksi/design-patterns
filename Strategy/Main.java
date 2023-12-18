import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myPlaylist = Arrays.asList("Song1", "Song2", "Song3", "Song4", "Song5");
        MusicPlayer player = new MusicPlayer(myPlaylist);

        player.setStrategy(new ShufflePlayStrategy());
        player.playNext();

        player.setStrategy(new RepeatOneStrategy());
        player.playNext();
        player.playNext();

        player.setStrategy(new SequentialPlayStrategy());
        player.playNext();
    }
}
