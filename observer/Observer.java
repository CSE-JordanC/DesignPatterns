package DesignPatterns.observer;

/*
 * Interface based on uml chart
 */

public interface Observer {
    /**
     * Called by subject to update the observer
     *
     * @param warning true if the notice is a warning or false if its a greeting
     * @param note    the note number issued by the subject
     */
    void update(boolean warning, int note);
}
