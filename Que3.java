package Collecton;
import java.util.HashMap;

public class Que3 {
    static void characterCount(String str)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char myCharArray[] = str.toCharArray();

        for (char eachCharacter : myCharArray)
        {
            if(hashMap.containsKey(eachCharacter))
            {
                hashMap.put(eachCharacter, hashMap.get(eachCharacter)+1);
            }
            else
            {
                hashMap.put(eachCharacter, 1);
            }
        }

        for (HashMap.Entry entry: hashMap.entrySet())
        {
            System.out.println("Occurences of each character in vinod kumar singh: "+entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        String myString = "vinod kuamr singh";
        characterCount(myString);
    }
}