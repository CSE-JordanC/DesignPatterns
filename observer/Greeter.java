package DesignPatterns.observer;

/*
 * A subject that issues greeter notices
 * Plays a trumpet sound and notifies all observers of a greeter
 */
public class Greeter extends Subject {
    @Override
    public void issueNotice(int note) {
        System.out.println("Trumpet fanfair is sounded " + note + " time(s).");
        Trumpet.play(false, note); // false = greeting
        notifyObservers(false, note);
    }
}
