package JAVA2;
public class Que4 {
    private static Que4 myObj;

    static{
        myObj = new Que4();
    }

    private Que4(){

    }

    public static Que4 getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String a[]){
        Que4 ms = getInstance();
        ms.testMe();
    }
}