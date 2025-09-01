package DesignPatterns.observer;

/*
 * An observer that reacts to both greetings and warnings
 */
public class Knight implements Observer {
    public Knight(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    @Override
    public void update(boolean warning, int note) {
        if (warning) {
            /*
             * Switches between different warnings or greetings based on note
             */
            switch (note) {
                case 1:
                System.out.println("Knight: Helps all citizens get to safety.");
                    break;
            
                case 2:
                System.out.println("Knight: Rushes to the breach and prepares for battle.");
                    break;
            }
        } else {
            switch (note) {
                case 1:
                System.out.println("Knight: Directs the messenger to the castle.");
                    break;
                case 2:
                System.out.println("Knight: Approaches the carriage of the royalty.");
                    break;
            }
        }
    }
}
