package DesignPatterns.observer;

/*
 * An observer that reacts to both greetings and warnings
 */
public class ShopOwner implements Observer {
    public ShopOwner(Subject watchman, Subject greeter) {
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
                System.out.println("Shop Owner: Closed down the shop and heads to safety.");
                    break;
            
                case 2:
                System.out.println("Shop Owner: Runs out the store to the closest shelter.");
                    break;
            }
        } else {
            switch (note) {
                case 1:
                System.out.println("Shop Owner: The most luxurious clothing and jewelery is brought on display.");
                    break;
                case 2:
                System.out.println("Shop Owner: Walks onto the street to smile and wave at the royalty.");
                    break;
            }
        }
    }
}
