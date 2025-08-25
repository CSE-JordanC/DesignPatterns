package DesignPatterns.strategy;

public class King extends Character{
    public King(String name)
    {
        super(name);
    }

    public String toString(){
        return "__/^^^\\__" + "\nYour character is a King named " + name;
    }
}
