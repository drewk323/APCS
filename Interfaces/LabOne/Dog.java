package LabOne;

public class Dog
{
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public void speak()
    {
        System.out.println("Woof! Woof!");
    }

    public String toString()
    {
        return "Dog:  " + name;
    }

    public class Dog implements Speakable{

    }
}