/*
 * Jordan Chavous
 */

package DesignPatterns.decorator;
import java.util.ArrayList;

/*
 * Represents a blueberry-flavored scoop of icecream
 */
public class BlueBerry extends ScoopDecorator {
    public static final String ANSI_BLUE = "\u001B[34m";

    /**
     * @param iceCream   the base {@link IceCream} cone being decorated
     * @param numScoops  the number of blueberry scoops to add
     */
    public BlueBerry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    /**
     * Prints a blue scoop and stacks it above the ice cream cone.
     * @return a string containing ASCII art of the blueberry scoops 
     *         stacked on top of the base ice cream cone
     */
    @Override
    public String toString() {
        ArrayList<String> scoop = new ArrayList<>();
        for (int i = 0; i < numScoops; i++) {
            scoop.add(buildScoop(ANSI_BLUE, scoopCounter));
            scoopCounter++;
        }
        return String.join("\n", scoop) + "\n" + iceCream.toString();
    }
}