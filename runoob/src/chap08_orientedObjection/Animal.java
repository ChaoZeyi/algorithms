package chap08_orientedObjection;

public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myId)
    {
        name = myName;
        id = myId;
    }
    public void eat()
    {
        System.out.println("this is eat method");
    }
    public void sleep()
    {
        System.out.println("this is sleep method");
    }
    public void introduction()
    {
        System.out.println("name: "+name);
        System.out.println("id: "+id);
    }
}
class Penguin extends Animal{
    public Penguin(String myName, int myId)
    {
        super(myName, myId);
    }
}