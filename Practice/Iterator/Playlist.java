
public interface Song {
    String getTitle();
    String getArtist();
}

public class RockSong implements Song {
    private String title;
    private String artist;

    public RockSong(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }
}

public class PopSong implements Song {
    private String title;
    private String artist;

    public PopSong(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }
}

public interface Playlist {
    void addSong(Song song);
    void removeSong(Song song);
    Iterator<Song> createIterator();
}

public class ConcetePlaylist implements Playlist {
    private List<Song> songs;

    public ConcetePlaylist() {
        this.songs = new ArrayList<>();
    }

    @Override
    public void addSong(Song song) {
        this.songs.add(song);
    }

    @Override
    public void removeSong(Song song) {
        this.songs.remove(song);
    }

    @Override
    public Iterator<Song> createIterator() {
        return new ConcreteSongIterator(this.songs);
    }
}

public interface SongIterator {
    boolean hasNext();
    Song next();
}

public class ConcreteSongIterator implements SongIterator {
    private List<Song> songs;
    private int position;

    public ConcreteSongIterator(List<Song> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}

public class Main {
    public static void main(String[] args) {
        Song rockSong1 = new RockSong("Rock Song 1", "Rock Artist 1");
        Song rockSong2 = new RockSong("Rock Song 2", "Rock Artist 2");
        Song rockSong3 = new RockSong("Rock Song 3", "Rock Artist 3");
        Song popSong1 = new PopSong("Pop Song 1", "Pop Artist 1");
        Song popSong2 = new PopSong("Pop Song 2", "Pop Artist 2");
        Song popSong3 = new PopSong("Pop Song 3", "Pop Artist 3");

        Playlist playlist = new ConcetePlaylist();
        playlist.addSong(rockSong1);
        playlist.addSong(rockSong2);
        playlist.addSong(rockSong3);
        playlist.addSong(popSong1);
        playlist.addSong(popSong2);
        playlist.addSong(popSong3);

        Iterator<Song> iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist());
        }
    }
}