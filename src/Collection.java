import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Kamlesh");
        arr.add("Sahu");
        System.out.println(arr);

        //System.out.println(arr.get(1));
        arr.set(2, "kamlesh");
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.size());

    }

}
