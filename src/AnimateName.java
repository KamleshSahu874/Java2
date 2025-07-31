public class AnimateName {
    public static void main(String[] args) throws InterruptedException {
        String name = "Kamlesh Kumar Sahu";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            Thread.sleep(200);
        }

        System.out.println(); //
    }
}
