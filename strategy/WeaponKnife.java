package DesignPatterns.strategy;

//WeaponKnife classes that extends from WeaponBehavior which is the super class
public class WeaponKnife extends WeaponBehavior{
    //Attack class in takenfrom WeaponBehavior class
    public void attack(){
        for (int i = 0; i<150; ++i){
            Resources.clear();//Clears out terminal so it just shows animation
            for(int j = 0; j<i; ++j){
                System.out.print(" ");//Adds space to make it seem like the knife is being thrown
            }
            System.out.print("-|==>");//Symbol for knife
            Resources.sleep(20);//How many miliseconds inbetween each action
        }
        System.out.println(" ");
    }
}
