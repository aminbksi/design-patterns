
public class Main {
    public static void main(String[] args) {
        
        String video_file = "test.mp4";
        
        MP4Player mp4_player = new MP4Player();
        MP4PlayerAdapter mp4_player_adapter = new MP4PlayerAdapter(mp4_player);
        VideoPlayer video_player = new VideoPlayer(mp4_player_adapter);
        video_player.play(video_file);

    }
}