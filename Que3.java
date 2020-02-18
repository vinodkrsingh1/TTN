public class Que3 {
    public static void main(String[] args)
    {
        String str = "vinodkumarsingh";
        int count = str.length() - str.replace("i", "").length();
        System.out.println("Number of occurances of 'i' in "+str+" = "+count);
    }
}