public class BlinkingName {
    public static void main(String[] args) throws InterruptedException {
        String name = "Kamlesh Kumar Sahu";

        for (int i = 0; i < 10; i++) {
            System.out.print("\r" + name);
            Thread.sleep(400);
            System.out.print("\r" + " ".repeat(name.length()));
            Thread.sleep(400);
        }

        System.out.print("\r" + name);



    }

}
