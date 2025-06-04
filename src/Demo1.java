public class Demo1 {

     class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread using Runnable interface");
        }
    }

    public static void main(String[] args) {
        Demo1 outer = new Demo1();
        MyRunnable obj = outer.new MyRunnable();
        Thread t1 = new Thread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < 5; i++) {

            //System.out.println("Main thread is running");
            System.out.println(i);
        }
    }
}