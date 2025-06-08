import java.util.*;

public class Collections5 {
    public static void main(String[] args) {


        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple");
        System.out.println("ArrayList: " + arrayList);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");
        System.out.println("HashSet: " + hashSet);

        // 3. HashMap - key-value pairs, unique keys
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(1, "Mango"); // replaces value for key 1
        System.out.println("HashMap: " + hashMap);
    }
}
