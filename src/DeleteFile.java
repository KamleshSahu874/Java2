import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("Failed to delete the file. It may not exist or is in use.");
        }
    }
}
