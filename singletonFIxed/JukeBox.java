package singletonFIxed;

import java.util.ArrayList;

/**
 * JukeBox is a Singleton class that manages the collection of songs
 * and handles requests to play them.
 * According to the Singleton pattern, only one instance of JukeBox exists.
 * @author Jordan Chavous
 */
public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;

    /**
     * Private constructor initializes the song list by loading from DataLoader.
     */
    private JukeBox() {
        songs = DataLoader.getSongs();
    }

    /**
     * Returns the single instance of JukeBox, creating it if necessary.
     * @return the singleton JukeBox instance
     */
    public static JukeBox getInstance() {
        if (jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * Gets all songs stored in the JukeBox.
     * @return an ArrayList of Song objects
     */
    public ArrayList<Song> getAllSongs() {
        return songs;
    }

    /**
     * Plays the song at the given index.
     * @param num the index of the song (0-based)
     */
    public void requestSong(int num) {
        if (num < 0 || num >= songs.size()) {
            System.out.println("Invalid song selection!");
            return;
        }
        Song s = songs.get(num);
        System.out.println("Now playing: " + s);
        s.play();
    }
}
