package multithreading;

class Worker{
    private int count = 0;

    public synchronized   void increment() {
        count++;
    }

    public void run() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);
    }
}


public class Que3b {
    public static void main(String[] args) {

        Worker w=new Worker();
        w.run();
    }

}