package DesignPatterns.strategy;

public class Troll extends Character{
    public Troll(String name)
    {
        super(name);
    }

    public String toString(){
        return "/^\\" + "\nYour character is a Troll named " + name;
    }
}
