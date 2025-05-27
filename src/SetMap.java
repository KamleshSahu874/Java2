import java.util.HashMap;

public class SetMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        //System.out.println(map.get("grapes"));
        for(String key: map.keySet()) {
            System.out.println(key);
        }
    }

}
