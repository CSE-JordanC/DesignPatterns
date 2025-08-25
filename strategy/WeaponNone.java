package DesignPatterns.strategy;

public class WeaponNone extends WeaponBehavior{
    public void attack(){
        System.out.print("Your hands are too feedble, you faint from exhaustion.\n");
    }
}
