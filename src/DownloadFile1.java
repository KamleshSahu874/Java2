class DownloadTask extends Thread {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int i = 0; i <= 100; i += 20) {
            System.out.println(fileName + " downloading... " + i + "%");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(fileName + " interrupted: " + e.getMessage());
            }
        }
        System.out.println(fileName + " download complete!");
    }
}

public class DownloadFile1 {
    public static void main(String[] args) {
        DownloadTask fileA = new DownloadTask("File A");
        DownloadTask fileB = new DownloadTask("File B");

        fileA.start();
        fileB.start();
    }
}
