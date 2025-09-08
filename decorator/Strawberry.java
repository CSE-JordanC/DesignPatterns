/*
 * Jordan Chavous
 */

package DesignPatterns.decorator;
import java.util.ArrayList;

/**
 * Represents a strawberry-flavored scoop of icecream
 */
public class Strawberry extends ScoopDecorator {
    public static final String ANSI_RED = "\u001B[31m";

    /**
     * @param iceCream   the {@link IceCream} cone being decorated
     * @param numScoops  the number of strawberry scoops to add
     */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    /**
     * Prints a red scoop and stacks it above the ice cream cone.
     * @return a string containing ASCII art of the strawberry scoops 
     *         stacked on top of the base ice cream cone
     */
    @Override
    public String toString() {
        ArrayList<String> scoop = new ArrayList<>();
        for (int i = 0; i < numScoops; i++) {
            scoop.add(buildScoop(ANSI_RED, scoopCounter));
            scoopCounter++;
        }
        return String.join("\n", scoop) + "\n" + iceCream.toString();
    }
}