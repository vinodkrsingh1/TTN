package JAVA2;
import java.util.Scanner;

public class Que7 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int seconds;
        int minutes ;
        int hours;
        int days;
        System.out.print("Enter the number of seconds : ");
        seconds = input.nextInt();
        days = seconds / 86400;
        hours = (seconds % 86400 ) / 3600 ;
        minutes = ((seconds % 86400 ) % 3600 ) / 60;
        int seconds_output = ((seconds % 86400 ) % 3600 ) % 60  ;


        System.out.println("The time entered in hours,minutes and seconds is:");
        System.out.println(days + "days:" + hours  + " hours :" + minutes + " minutes:" + seconds_output +" seconds");
    }

}