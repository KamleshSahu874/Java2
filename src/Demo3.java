public class Demo3 {
    public static void main(String[] args) {
        System.out.println("idhar dekho");
        Thread t1=new Thread(()->{
            System.out.println("hello bro!");
        });
        Thread t2=new Thread(()->{
            System.out.println("hiii");

        });
        t1.start();
        t2.start();

    }
}
