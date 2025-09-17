import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();

        long startTime = System.nanoTime();

        arr.add(10);

        System.out.println("Element at index 0: " + arr.get(0));

        System.out.println("Contains 10? " + arr.contains(10));

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken (nanoseconds): " + duration);
    }
}
