package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterator that traverses an array of songs in order.
 * Null entries mark the end of the album.
 * @author Jordan Chavous
 */
public class InOrderIterator implements Iterator<Song> {
    private Song[] songs;
    private int position;

    /**
     * Constructs an in-order iterator for the given array of songs.
     * @param songs the array of songs to iterate over
     */
    public InOrderIterator(Song[] songs) {
        this.songs = songs;
        this.position = 0;
    }

    /**
     * Checks if there are more songs to iterate over.
     * @return true if another song is available, false otherwise
     */
    @Override
    public boolean hasNext() {
        while (position < songs.length && songs[position] == null) {
            position++;
        }
        return position < songs.length && songs[position] != null;
    }

    /**
     * Returns the next song in the iteration.
     * @return the next Song
     * @throws NoSuchElementException if no songs remain
     */
    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Song s = songs[position];
        position++;
        return s;
    }
}

