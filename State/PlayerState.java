import java.util.Objects;

interface PlayerState {
    void play(MusicPlayer player);

    void pause(MusicPlayer player);

    void stop(MusicPlayer player);
}
