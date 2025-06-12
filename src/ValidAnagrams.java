import java.util.*;

public class ValidAnagrams {
    public static void main(String[] args) {

        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live"};

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Convert word to character array, sort it, then make a string again
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Put into map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        // Print anagram groups
        for (List<String> group : map.values()) {
            if (group.size() > 1) {
                System.out.println(group);
            }
        }
    }
}
