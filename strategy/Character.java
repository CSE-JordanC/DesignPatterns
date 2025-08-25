package DesignPatterns.strategy;
/*
* Abstract class based on the UML Chart, it allows the other 
 *classes under character to take from the super class and inhereit from it
*/
public abstract class Character {
    protected String name;
    private WeaponBehavior weaponBehavior;

    //This is a class for your specified characters name
    public Character(String name)
    {
        this.name = name;
    }

    //Method for users specified attack
    public void attack(){
        weaponBehavior.attack();
    }

    //WeaponBehavior method that allows user to select which weapn they want
    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    //Returns nothing based on UML
    public abstract String toString();
}
