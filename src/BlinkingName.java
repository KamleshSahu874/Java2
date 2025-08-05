public class BlinkingName {
    public static void main(String[] args) throws InterruptedException {
        String name = "Kamlesh Kumar Sahu";

        for (int i = 0; i < 10; i++) {
            System.out.print("\r" + name);
            Thread.sleep(400);             // wait 400ms

            System.out.print("\r" + " ".repeat(name.length())); // clear the name
            Thread.sleep(400);             // wait 400ms
        }

        // Finally show the name permanently
        System.out.print("\r" + name);
    }
}
