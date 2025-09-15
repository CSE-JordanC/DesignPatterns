/*
 * Jordan Chavous
 */

package state;

/**
 * Represents a package with a name, quantity, and delivery state.
 * Implements the State design pattern to transition between Ordered, InTransit, and Delivered states.
 */
public class Package {
    private String name;
    private int quantity;
    private State state;

    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * Constructs a Package with the given name and quantity.
     * @param name     the name of the package item
     * @param quantity the number of items in the package
     */
    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

        this.orderedState = new OrderedState(this);
        this.inTransitState = new InTransitState(this);
        this.deliveredState = new DeliveredState(this);

        this.state = orderedState;
    }

    /**
     * Places the package into the Ordered state.
     * @return status and ETA messages for the ordered state
     */
    public String order() {
        state = orderedState;
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Moves the package into the InTransit state.
     * @return status and ETA messages for the in-transit state
     */
    public String mail() {
        state = inTransitState;
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Moves the package into the Delivered state.
     * @return status and ETA messages for the delivered state
     */
    public String received() {
        state = deliveredState;
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Sets the current state of the package.
     * @param state the new state of the package
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the name of the package item.
     * @return the name of the package item
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the display name of the package, appending "'s" if multiple items are ordered.
     * @return the display name of the package
     */
    public String getDisplayName() {
        if (quantity == 1) {
            return name;
        } else {
            return name + "'s";
        }
    }

    /**
     * Returns the correct verb form depending on the package quantity.
     * @param singular the singular form of the verb
     * @param plural   the plural form of the verb
     * @return the correct verb form (singular if quantity == 1, otherwise plural)
     */
    public String getVerb(String singular, String plural) {
        return (quantity == 1) ? singular : plural;
    }
}
