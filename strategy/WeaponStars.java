package DesignPatterns.strategy;

public class WeaponStars extends WeaponBehavior{
    public void attack(){
        System.out.println("");
        Resources.clear();
        for(int i = 0; i<100; ++i){
            System.out.print("*");
            Resources.sleep(30);
        }
        System.out.print("\n");
    }
}