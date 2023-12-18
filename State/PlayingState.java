class PlayingState implements PlayerState {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Already playing!");
    }

    @Override
    public void pause(MusicPlayer player) {
        player.setState(new PausedState());
        System.out.println("Paused the music.");
    }

    @Override
    public void stop(MusicPlayer player) {
        player.setState(new StoppedState());
        System.out.println("Stopped the music.");
    }
}
