package DesignPatterns.strategy;

public class WeaponStars implements WeaponBehavior{
    public void attack(){
        System.out.print("*");
    }
}