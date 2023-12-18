class StoppedState implements PlayerState {
    @Override
    public void play(MusicPlayer player) {
        player.setState(new PlayingState());
        System.out.println("Started playing music.");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Can't pause when stopped!");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Already stopped!");
    }
}
