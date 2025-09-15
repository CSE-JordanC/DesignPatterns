/*
 * Jordan Chavous
 */

package state;

/**
 * State representing a package that has been delivered.
 */
public class DeliveredState extends State {

    /**
     * Constructs a DeliveredState for the given package.
     * @param pkg the package associated with this state
     */
    public DeliveredState(Package pkg) {
        super(pkg);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getDisplayName() + " " + pkg.getVerb("has", "have") + " arrived.";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getETA() {
        return "The " + pkg.getDisplayName() + " " + pkg.getVerb("is", "are") + " here.";
    }
}
