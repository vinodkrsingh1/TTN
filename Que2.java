package Collecton;

import java.util.HashSet;

public class Que2 {
    static void countCharacter(String str)
    {
        char charArray[] = str.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for(int i =0;i<charArray.length; i++)
        {
            hashSet.add(charArray[i]);
        }
        System.out.println("number of unique characters in vinod kumar singh : "+hashSet.size());
    }
    public static void main(String[] args) {
        String myString = "vinod kumar singh";
        countCharacter(myString);

    }
}