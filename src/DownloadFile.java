public class DownloadFile {
    public static void main(String[] args) {
        String file = "File";

        for (int i = 0; i <= 100; i += 20) {
            System.out.println(file + " downloading... " + i + "%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println(file + " download complete!");
    }
}
