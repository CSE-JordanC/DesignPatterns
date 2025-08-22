package DesignPatterns.strategy;

public class WeaponNone implements WeaponBehavior{
    public void attack(){
        System.out.print("Your hands are too feedble, you faint from exhaustion.");
    }
}
