package iterator;

/**
 * Represents a single song with name, artist, length, and genre.
 * @author Jordan Chavous
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    /**
     * Constructs a Song object.
     * @param name   the title of the song
     * @param artist the artist who performs the song
     * @param length the length of the song in minutes
     * @param genre  the musical genre of the song
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Gets the song's title.
     * @return the name of the song
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the song's artist.
     * @return the artist of the song
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Gets the song's length.
     * @return the length of the song in minutes
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets the song's genre.
     * @return the genre of the song
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Returns a formatted string representation of the song.
     * @return a string containing song details
     */
    @Override
    public String toString() {
        return String.format("%s by %s, Length: (%.2f), Genre: [%s]", name, artist, length, genre);
    }
}
