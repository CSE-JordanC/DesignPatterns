package DesignPatterns.strategy;

//WeaponBow classes that extends from WeaponBehavior which is the super/parent class
public class WeaponBow extends WeaponBehavior {
    //Attack class in takenfrom WeaponBehavior class
    public void attack(){
        for (int i = 0; i<100; ++i){
            Resources.clear();//Clears out terminal so it just shows animation
            System.out.print(")");//Symbol for bow
            for(int j = 0; j<i; ++j){
                System.out.print(" ");//Adds space to make it seem like the arrow is being shot
            }
            System.out.print("}---->");//Symbol for arrow
            Resources.sleep(10);//How many miliseconds inbetween each action
        }
        System.out.println(" ");
    }
}
