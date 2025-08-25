package DesignPatterns.strategy;

//Knight class that extends from Character because character is the super class
public class Knight extends Character{
    //Takes the name from users input and stes it as the Knights name
    public Knight(String name)
    {
        super(name);
    }

    //Fills in the empty toString method to display the Knights name and symbol for it
    public String toString(){
        return "(--)" + "\nYour character is a Knight named " + name;
    }
}
