package DesignPatterns.strategy;

public interface WeaponBehavior {
    public default int speed(){
            return 0;
        }

    public void attack();
}
