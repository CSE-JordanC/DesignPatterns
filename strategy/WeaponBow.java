package DesignPatterns.strategy;

public class WeaponBow extends WeaponBehavior {
    public void attack(){
        for (int i = 0; i<100; ++i){
            Resources.clear();
            System.out.print(")");
            for(int j = 0; j<i; ++j){
                System.out.print(" ");
            }
            System.out.print("}---->");
            Resources.sleep(10);
        }
        System.out.println(" ");
    }
}
