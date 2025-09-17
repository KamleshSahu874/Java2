import java.util.HashMap;
public class WordCount {
    public static void main(String[] args) {
        //String str = "hello world hello java";
        String str ="programming is fun and fun is programming";
        String[] words = str.split(" ");
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word count in the string:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
    
}
