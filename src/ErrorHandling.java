public class ErrorHandling {
    public static void main(String[] args) {
        int a=10; int b=5;
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("we cannot divide");
        }
        System.out.println("hello");
        System.out.println("hiii");
        System.out.println("A weds A");
    }
}
