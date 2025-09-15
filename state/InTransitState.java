/*
 * Jordan Chavous
 */

package state;

/**
 * State representing a package that is in transit.
 */
public class InTransitState extends State {
    private int days = 5; // base transit time

    /**
     * Constructs an InTransitState for the given package.
     * @param pkg the package associated with this state
     */
    public InTransitState(Package pkg) {
        super(pkg);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getDisplayName() + " " + pkg.getVerb("is", "are") + " out for delivery.";
    }

    /**
     * {@inheritDoc}
     * Adds a 30% chance of delay (1–7 business days).
     */
    @Override
    public String getETA() {
        if (random.nextInt(100) < 30) {
            int delay = 1 + random.nextInt(7);
            days += delay;
            return "The " + pkg.getDisplayName() + " " + pkg.getVerb("has", "have")
                    + " experienced a delay in shipping.\n"
                    + "The " + pkg.getDisplayName() + " should arrive within " + days + " business days.";
        }
        return "The " + pkg.getDisplayName() + " should arrive within " + days + " business days.";
    }
}