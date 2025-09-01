package DesignPatterns.observer;

/*
 * A subject that issues warning notices
 * Plays a trumpet sound and notifies all observers of danger
 */
public class Watchman extends Subject {
    @Override
    public void issueNotice(int note) {
        System.out.println("Trumpet is honked " + note + " time(s).");
        Trumpet.play(true, note); // true = warning
        notifyObservers(true, note);
    }
}
