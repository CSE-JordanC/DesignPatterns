package singletonFIxed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * DataLoader is responsible for loading songs from a text file.
 * The expected format of each line is:
 *   title , artist , filePath
 * Example:
 *   Saguaro , Austin Moffa , Austin-Moffa-Saguaro.wav
 * @author Jordan Chavous
 */
public class DataLoader {

    /**
     * Reads songs from "songs.txt" and returns them as an ArrayList.
     * @return an ArrayList of Song objects loaded from the file
     */
    public static ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();
        File f = new File("/Users/jordanchavous/CSCE247/DesignPatterns/singletonFixed/songs.txt");

        if (!f.exists()) {
            System.out.println("songs.txt not found!");
            return songs;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String title = parts[0].trim();
                    String artist = parts[1].trim();
                    String filePath = parts[2].trim();
                    songs.add(new Song(title, artist, filePath));
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading songs: " + e.getMessage());
        }

        return songs;
    }
}

