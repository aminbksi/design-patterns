class PausedState implements PlayerState {
    @Override
    public void play(MusicPlayer player) {
        player.setState(new PlayingState());
        System.out.println("Resumed the music.");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Already paused!");
    }

    @Override
    public void stop(MusicPlayer player) {
        player.setState(new StoppedState());
        System.out.println("Stopped the music.");
    }
}
