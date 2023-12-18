public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();  // "Started playing music."
        player.play();  // "Already playing!"
        player.pause(); // "Paused the music."
        player.pause(); // "Already paused!"
        player.stop();  // "Stopped the music."
        player.play();  // "Started playing music."
    }
}
