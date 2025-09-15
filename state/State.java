/*
 * Jordan Chavous
 */

package state;

import java.util.Random;

/**
 * Abstract base class representing a package delivery state.
 * Each concrete state (Ordered, InTransit, Delivered) defines its own behavior.
 */
public abstract class State {
    protected Package pkg;

    /** Random generator for introducing possible delays */
    protected Random random = new Random();

    /**
     * Constructs a state with the given package.
     * @param pkg the package associated with this state
     */
    public State(Package pkg) {
        this.pkg = pkg;
    }

    /**
     * Returns the current status message of the package.
     * @return a String representing the package's status
     */
    public abstract String getStatus();

    /**
     * Returns the estimated time of arrival message for the package.
     * @return a String representing the ETA message
     */
    public abstract String getETA();
}