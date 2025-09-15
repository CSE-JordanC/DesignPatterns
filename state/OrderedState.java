/*
 * Jordan Chavous
 */

package state;


/**
 * State representing a package that has been ordered but not yet shipped.
 */
public class OrderedState extends State {
    private int days = 2; // base delivery time

    /**
     * Constructs an OrderedState for the given package.
     * @param pkg the package associated with this state
     */
    public OrderedState(Package pkg) {
        super(pkg);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getDisplayName() + " " + pkg.getVerb("was", "were") + " ordered.";
    }

    /**
     * {@inheritDoc}
     * Adds a 20% chance of delay (1–3 business days).
     */
    @Override
    public String getETA() {
        if (random.nextInt(100) < 20) {
            int delay = 1 + random.nextInt(3);
            days += delay;
            return "The " + pkg.getDisplayName() + " " + pkg.getVerb("has", "have")
                    + " experienced a slight delay in manufacturing.\n"
                    + "The " + pkg.getDisplayName() + " will be shipped within " + days + " business days.";
        }
        return "The " + pkg.getDisplayName() + " will be shipped within " + days + " business days.";
    }
}