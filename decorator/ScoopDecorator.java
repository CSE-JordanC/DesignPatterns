/*
 * Jordan Chavous
 */

package DesignPatterns.decorator;

/**
 * This class manages shared scoop-tracking logic and provides a helper method
 * to build colored scoop ASCII art.
 */
abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    public static final String ANSI_RESET = "\u001B[0m";

    /*
     * Tracks the scoops across all flavors and the scoops for current cone
     */
    protected static int scoopCounter = 0;   
    protected static int totalScoops = 0;

    /**
     * Constructs a {@ScoopDecorator} with the given ice cream and scoop count.
     *
     * @param iceCream   the {@IceCream} object being decorated
     * @param numScoops  the number of scoops of this flavor to add
     */
    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
        /*
         * Counts the total scoops for whole cone
         */
        totalScoops += numScoops;
    }

    /**
     * Helper method for building a colored ASCII representation of a scoop instead of using repetitive code in each flavor file.
     * @param color       the ANSI escape code for the scoop color
     * @param scoopIndex  the index of this scoop (0 = top scoop, increasing downward)
     */
    protected String buildScoop(String color, int scoopIndex) {
        int dashes;
    
        if (scoopIndex == 0 || totalScoops == 1) {
            dashes = 0;
        } else {
            dashes = (int) Math.round((10.0 * scoopIndex) / (totalScoops - 1));
        }
    
        /*
         * Makes the dashes for the scoops always even
         */
        if (dashes % 2 != 0) {
            dashes++;
        }
    
        /*
         * Plus 2 for the parentheses
         */
        int scoopWidth = dashes + 2;
    
        final int MAX_WIDTH = 12;
        int spaces = (MAX_WIDTH - scoopWidth) / 2;

        /*
         * Adds spaces to center the scoop
         */
        StringBuilder sb = new StringBuilder();
        for (int s = 0; s < spaces; s++) sb.append(" ");
    
        /*
         * Builds the scoop and then resets the color
         */
        sb.append(color).append("(");
        for (int j = 0; j < dashes; j++) {
            sb.append("-");
        }
        sb.append(")").append(ANSI_RESET);

        /*
         * 
         * @return a string representing the ASCII art of the scoop
         */
        return sb.toString();
    }
    
}
