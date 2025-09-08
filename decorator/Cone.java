/*
 * Jordan Chavous
 */

package DesignPatterns.decorator;

/**
 * It loads ASCII art of a cone from a text file and provides a 
 * string representation for display.
 */
public class Cone extends IceCream{
    private static final String ANSI_BROWN = "\u001B[38;5;130m";

    /**
     * Constructs a new @Cone
     * The cone ASCII art is loaded from a text file, 
     * and the scoop count is initialized to zero.
     */
    public Cone()
    {
        FileReader reader = new FileReader();
        this.asciiArt = reader.getLines("/Users/jordanchavous/CSCE247/DesignPatterns/decorator/txt/cone.txt");
        this.numScoops = 0;
    }

    /**
     * @return a string containing the colored ASCII art of the cone
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (String line : asciiArt) {
            sb.append(ANSI_BROWN).append(line).append("\n");
        }
        return sb.toString();
    }
}
