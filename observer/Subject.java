package DesignPatterns.observer;

import java.util.ArrayList;

/*
 * Abstract class based on uml chart
 */
public abstract class Subject {
    protected ArrayList<Observer> observers;

    /*
     * Makes an emtpy list
     */
    public Subject() {
        observers = new ArrayList<>();
    }

    /*
     * Registers observer to the subject
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /*
     * Removes observer from the subject
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /*
     * Notifies observers of a notice
     */
    protected void notifyObservers(boolean warning, int note) {
        for (Observer obs : observers) {
            obs.update(warning, note);
        }
    }

    /**
     * Issues a notice based on different subjects (watchman or greeter)
     *
     * @param note the note number
     */
    public abstract void issueNotice(int note);
}
