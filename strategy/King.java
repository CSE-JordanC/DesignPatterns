package DesignPatterns.strategy;

//King class extends from Character since character is the super/parent class
public class King extends Character{
    //Takes name from users input and sets it as the Kings name
    public King(String name)
    {
        super(name);
    }

    //Fills in the empty toString method so you can display the Kings name and symbol for it
    public String toString(){
        return "__/^^^\\__" + "\nYour character is a King named " + name;
    }
}
