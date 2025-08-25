package DesignPatterns.strategy;

//WeaponStars classes that extends from Weapon behavior which is the super/parent class
public class WeaponStars extends WeaponBehavior{
    //Attack class in takenfrom WeaponBehavior class
    public void attack(){
        System.out.println("");//Adds space to make it seem like the stars is being thrown
        Resources.clear();//Clears out terminal so it just shows animation
        for(int i = 0; i<100; ++i){
            System.out.print("*");//Symbol for stars
            Resources.sleep(30);//How many miliseconds inbetween each action
        }
        System.out.print("\n");
    }
}