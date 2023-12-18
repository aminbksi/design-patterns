import java.util.Objects;

class MusicPlayer {
    private PlayerState state;

    public MusicPlayer() {
        this.state = new StoppedState();
    }

    public void setState(PlayerState state) {
        this.state = Objects.requireNonNull(state, "state must not be null");
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
