import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteration1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Raj");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        System.out.println("alag hu mai");

        while (iterator.hasPrevious()) {
            String previousItem = iterator.previous();
            System.out.println(previousItem);
        }

        // System.out.println("End of List Iteration");
    }
}
