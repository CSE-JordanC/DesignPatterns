package DesignPatterns.observer;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(boolean warning, int note) {
        for (Observer obs : observers) {
            obs.update(warning, note);
        }
    }

    public abstract void issueNotice(int note);
}
