public class Que8 {
    public static void main(String[] args) {
        String s="vinodprajjwal";
        System.out.println("Original string : "+s);
        StringBuffer sb=new StringBuffer(s);
        //here we convert buffer into string


        //here we reverse the  String
        System.out.println("after reverse and deleting index from 4 to 9 : "+sb.reverse().delete(4,9));



    }
}