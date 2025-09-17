

public class Collection1 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 2, 3, 3, 3, 4, 4,5};
        //TreeSet<String> Set = new TreeSet<>();
        //Set.add("K");
        //Set.add("S");
        
       // System.out.println(Set);
       // System.out.println(arr);
       System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        //System.out.println("\nArray length: " + arr.length);
        
        // Example of using a TreeSet to remove duplicates
        java.util.TreeSet<Integer> uniqueSet = new java.util.TreeSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        
        System.out.println("Unique elements in the array: " + uniqueSet);

    }
    
}
