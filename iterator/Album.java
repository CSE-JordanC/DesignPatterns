package iterator;

import java.util.Iterator;

/**
 * Represents an album containing multiple songs.
 * Supports both in-order and shuffled iteration of its songs.
 * @author Jordan Chavous
 */
public class Album {
    private Song[] songs;
    private int count;
    private String name;

    private static final int DEFAULT_CAPACITY = 50;

    /**
     * Constructs an Album with a given name.
     * @param name the name of the album
     */
    public Album(String name) {
        this.name = name;
        this.songs = new Song[DEFAULT_CAPACITY];
        this.count = 0;
    }

    /**
     * Adds a new song to the album.
     * @param name   the title of the song
     * @param artist the artist of the song
     * @param length the length of the song in minutes
     * @param genre  the genre of the song
     * @return true if the song was added successfully, false if the album is full
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        if (count >= songs.length) {
            return false;
        }
        songs[count++] = new Song(name, artist, length, genre);
        return true;
    }

    /**
     * Creates an iterator to traverse songs in order.
     * @return an in-order iterator for the album's songs
     */
    public Iterator<Song> createInOrderIterator() {
        return new InOrderIterator(songs);
    }

    /**
     * Creates an iterator to traverse songs in random order.
     * @return a shuffle iterator for the album's songs
     */
    public Iterator<Song> createShuffleIterator() {
        return new ShuffleIterator(songs);
    }

    /**
     * Gets the name of the album.
     * @return the album's name
     */
    public String getName() {
        return name;
    }
}

