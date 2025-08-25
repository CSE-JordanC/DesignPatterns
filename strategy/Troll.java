package DesignPatterns.strategy;

//Troll class that extends from Character class since character is the parent class
public class Troll extends Character{
    //Takes name from users input and sets it as the Troll name
    public Troll(String name)
    {
        super(name);
    }

    //Fills in the empty toString method to display the Trolls name and symbol
    public String toString(){
        return "/^\\" + "\nYour character is a Troll named " + name;
    }
}
