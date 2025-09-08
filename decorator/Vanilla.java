/*
 * Jordan Chavous
 */

package DesignPatterns.decorator;
import java.util.ArrayList;

/**
 * Represents a vanilla-flavored scoop of icecream
 */
public class Vanilla extends ScoopDecorator {
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * @param iceCream   the {@link IceCream} cone being decorated
     * @param numScoops  the number of vanilla scoops to add
     */
    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    /**
     * Prints a white scoop and stacks it above the ice cream cone.
     * @return a string containing ASCII art of the vanilla scoops 
     *         stacked on top of the base ice cream cone
     */
    @Override
    public String toString() {
        ArrayList<String> scoop = new ArrayList<>();
        for (int i = 0; i < numScoops; i++) {
            scoop.add(buildScoop(ANSI_WHITE, scoopCounter));
            scoopCounter++;
        }
        return String.join("\n", scoop) + "\n" + iceCream.toString();
    }
}
