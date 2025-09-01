package DesignPatterns.observer;

public class Greeter extends Subject {
    @Override
    public void issueNotice(int note) {
        System.out.println("Trumpet fanfair is sounded " + note + " time(s).");
        Trumpet.play(false, note); // false = greeting
        notifyObservers(false, note);
    }
}
