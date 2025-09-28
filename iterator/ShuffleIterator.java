package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Iterator that traverses an array of songs in random order.
 * Null entries are ignored.
 * @author Jordan Chavous
 */
public class ShuffleIterator implements Iterator<Song> {
    private Song[] order;
    private int position;
    private Random rand;

    /**
     * Constructs a shuffle iterator for the given array of songs.
     * @param songs the array of songs to shuffle and iterate over
     */
    public ShuffleIterator(Song[] songs) {
        this.rand = new Random();
        int count = 0;
        for (Song s : songs) {
            if (s != null) count++;
        }
        order = new Song[count];
        int idx = 0;
        for (Song s : songs) {
            if (s != null) {
                order[idx++] = s;
            }
        }
        // Shuffle using Fisher-Yates
        for (int i = order.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Song tmp = order[i];
            order[i] = order[j];
            order[j] = tmp;
        }
        position = 0;
    }

    /**
     * Checks if there are more songs to iterate over.
     * @return true if another song is available, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < order.length;
    }

    /**
     * Returns the next song in the shuffled iteration.
     * @return the next Song
     * @throws NoSuchElementException if no songs remain
     */
    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return order[position++];
    }
}

