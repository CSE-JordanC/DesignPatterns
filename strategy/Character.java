package DesignPatterns.strategy;

public abstract class Character {
    protected String name;
    private WeaponBehavior weaponBehavior;

    public Character(String name)
    {
        this.name = name;
    }

    public void attack(){
        weaponBehavior.attack();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public abstract String toString();
}
