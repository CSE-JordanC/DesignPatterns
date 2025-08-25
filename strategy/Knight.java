package DesignPatterns.strategy;

public class Knight extends Character{
    public Knight(String name)
    {
        super(name);
    }

    public String toString(){
        return "(--)" + "\nYour character is a Knight named " + name;
    }
}
