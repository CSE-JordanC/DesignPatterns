/*
 * Jordan Chavous
 */

package DesignPatterns.decorator;
import java.util.ArrayList;

/**
 * Defines the core behavior of ice cream objects and 
 * provides a common structure for cones, scoops, and decorators.
 */
abstract class IceCream {
    protected ArrayList<String> asciiArt = new ArrayList<>();
    protected int numScoops;

     /*
     * @return a string representing the ASCII art of the ice cream
     */
    public abstract String toString();
}
