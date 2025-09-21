package singletonFIxed;

/**
 * Represents a Song with a title, artist, and file path.
 * Provides a method to play the song using the SongPlayer.
 * @author Jordan Chavous
 */
public class Song {
    private String title;
    private String artist;
    private String filePath;

    /**
     * Constructs a new Song.
     * @param title    the title of the song
     * @param artist   the artist of the song
     * @param fileName the file path to the song file
     */
    public Song(String title, String artist, String fileName) {
        this.title = title.trim();
        this.artist = artist.trim();
        this.filePath = fileName.trim();
    }

    /**
     * Plays the song by delegating to the SongPlayer.
     */
    public void play() {
        SongPlayer.play(filePath);
    }

    /**
     * Returns a string representation of the song.
     * @return a formatted string with title and artist
     */
    @Override
    public String toString() {
        return title + " - " + artist;
    }
}
