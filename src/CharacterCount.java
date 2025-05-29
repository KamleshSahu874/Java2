import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "kamlesh";
        char[] ch = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : ch) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println("Character count in the string:");
        for (char c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}

