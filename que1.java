import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class que1 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

        System.out.println("enter your String:");
        String s=br.readLine();



        System.out.println("enter sub string which you want to replace");
        String rep=br.readLine();

        System.out.println("enter your sub string ");
        String sub=br.readLine();

        String chang= s.replaceFirst(rep,sub);
        System.out.println(chang);




    }
}