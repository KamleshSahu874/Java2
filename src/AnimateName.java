public class AnimateName {
    public static void main(String[] args) throws InterruptedException {
        String name = "Kamlesh Kumar Sahu";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            Thread.sleep(200); // delay in milliseconds (200ms = 0.2 sec)
        }

        System.out.println(); //
    }
}
