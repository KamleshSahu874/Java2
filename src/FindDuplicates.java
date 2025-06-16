import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Use HashSet to track seen numbers
        Set<Integer> seen = new HashSet<>();
        boolean foundDuplicate = false;

        System.out.println("Duplicate numbers:");
        for(int num : arr) {
            if(seen.contains(num)) {
                System.out.println(num);
                foundDuplicate = true;
            } else {
                seen.add(num);
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }
}
