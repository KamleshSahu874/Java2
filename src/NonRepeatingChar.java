import java.util.HashMap;
public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : ch) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println("Non-repeating characters in the string:");
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println(c);
            }
        }
    }

}
