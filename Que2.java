package multithreading;

class Runner implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
class Threads extends Thread{

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

public class Que2 {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Runner());
        thread1.start();
        Threads thread2=new Threads();
        thread2.start();
    }
}