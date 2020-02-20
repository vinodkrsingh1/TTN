package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Even implements Runnable{

    @Override
    public void run() {
        for(int i=2;i<=20;i=i+2 )
            System.out.println(i);
    }
}

class Odd implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=20;i=i+2)
            System.out.println(i);
    }
}

public class Que4 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new Odd());
        executor.submit(new Even());

        executor.shutdown();



    }


}