public class LambdaExp {
    public static void main(String[] args) {
        Runnable r= new Runnable(){
            public void run(){
                System.out.println("Runnable using Anonymous class");

            }
        };
    }
}
