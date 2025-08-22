package DesignPatterns.strategy;

public class Character {
    protected String name;
    WeaponBehavior weaponBehavior;

    public Character(String name)
    {
        this.name = name;
    }

    public void attack(){
        
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior){

    }

    public String toString(){
        return "";
    }
}
