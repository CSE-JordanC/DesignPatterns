package DesignPatterns.strategy;

public class WeaponKnife extends WeaponBehavior{
    public void attack(){
        for (int i = 0; i<150; ++i){
            Resources.clear();
            for(int j = 0; j<i; ++j){
                System.out.print(" ");
            }
            System.out.print("-|==>");
            Resources.sleep(20);
        }
        System.out.println(" ");
    }
}
