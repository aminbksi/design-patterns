
public class ImageLibraryA {
    public void loadImage(String filename) {
        System.out.println("Displaying image " + song);
    }
}

public class AudioLibraryB {
    public void playAudio(String filename) {
        System.out.println("Playing audio " + song);
    }
}

public class VideoLibraryC {
    public void playVideo(String filename) {
        System.out.println("Playing video " + song);
    }
}

public interface MultimediaAdapter {
    void displayMultimedia(String filename);
}

public class ImageLibraryAdapter implements MultimediaAdapter {
    private ImageLibraryA imageLibraryA;

    public ImageLibraryAdapter(ImageLibraryA imageLibraryA) {
        this.imageLibraryA = imageLibraryA;
    }

    @Override
    public void displayMultimedia(String filename) {
        imageLibraryA.loadImage(filename);
    }
}

public class AudioLibraryAdapter implements MultimediaAdapter {
    private AudioLibraryB audioLibraryB;

    public AudioLibraryAdapter(AudioLibraryB audioLibraryB) {
        this.audioLibraryB = audioLibraryB;
    }

    @Override
    public void displayMultimedia(String filename) {
        audioLibraryB.playAudio(filename);
    }
}

public class VideoLibraryAdapter implements MultimediaAdapter {
    private VideoLibraryC videoLibraryC;

    public VideoLibraryAdapter(VideoLibraryC videoLibraryC) {
        this.videoLibraryC = videoLibraryC;
    }

    @Override
    public void displayMultimedia(String filename) {
        videoLibraryC.playVideo(filename);
    }
}

public class MultimediaPlayer {
    private MultimediaAdapter multimediaAdapter;

    public MultimediaPlayer(MultimediaAdapter multimediaAdapter) {
        this.multimediaAdapter = multimediaAdapter;
    }

    public void play(String filename) {
        multimediaAdapter.displayMultimedia(filename);
    }
}

public class Main {
    public static void main(String[] args) {
        MultimediaPlayer multimediaPlayer = new MultimediaPlayer(new ImageLibraryAdapter(new ImageLibraryA()));
        multimediaPlayer.play("image.jpg");

        multimediaPlayer = new MultimediaPlayer(new AudioLibraryAdapter(new AudioLibraryB()));
        multimediaPlayer.play("audio.mp3");

        multimediaPlayer = new MultimediaPlayer(new VideoLibraryAdapter(new VideoLibraryC()));
        multimediaPlayer.play("video.mp4");
    }
}