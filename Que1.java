package Collecton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Que1 {
    public static void main(String[] args) {
        List<Float> myArrayList = new ArrayList<>();
        myArrayList.add(25f);
        myArrayList.add(45f);
        myArrayList.add(84f);
        myArrayList.add(36f);
        myArrayList.add(2f);
        float mySum = 0f;
        System.out.println("elements of list are : "+myArrayList);
        Iterator<Float> myIterator = myArrayList.iterator();

        while(myIterator.hasNext())
            mySum += myIterator.next();

        System.out.println("sum is : "+mySum);
    }
}