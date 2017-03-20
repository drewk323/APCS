package LabOne;

import java.util.*;

public class AnimalRunner
{
    public static void main(String[] args)
    {
        ArrayList dogcatList = new ArrayList();
        dogcatList.add(new Dog("Fred"));
        // dogList.add(new Cat("Wanda"));
        for (Object obj : dogcatList)
        {
            obj.speak();
        }
    }
}