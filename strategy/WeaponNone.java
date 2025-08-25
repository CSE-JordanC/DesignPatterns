package DesignPatterns.strategy;

//WeaponNone classes that extends from Weapon behavior which is the parent class
public class WeaponNone extends WeaponBehavior{
    //Attack class in takenfrom WeaponBehavior class
    public void attack(){
        Resources.clear();//Clears out terminal so it just shows print statement
        System.out.print("Your hands are too feedble, you faint from exhaustion.\n");
    }
}
