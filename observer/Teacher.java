package DesignPatterns.observer;

public class Teacher implements Observer {
    public Teacher(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    @Override
    public void update(boolean warning, int note) {
        if (warning) {
            switch (note) {
                case 1:
                System.out.println("Teacher: Takes children home to be more safe.");
                    break;
            
                case 2:
                System.out.println("Teacher: Takes the children to the nearby basement for shelter.");
                    break;
            }
        } else {
            switch (note) {
                case 1:
                System.out.println("Teacher: Starts and education game so the whole class looks like they are having fun.");
                    break;
                case 2:
                System.out.println("Teacher: Brings the children outside to gaze at the royalty.");
                    break;
            }
        }
    }
}
