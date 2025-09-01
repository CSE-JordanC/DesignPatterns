package DesignPatterns.observer;

public class Watchman extends Subject {
    @Override
    public void issueNotice(int note) {
        System.out.println("Trumpet is honked " + note + " time(s).");
        Trumpet.play(true, note); // true = warning
        notifyObservers(true, note);
    }
}
