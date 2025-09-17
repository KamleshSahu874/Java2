
import java.util.ArrayList ;
import java.util.Iterator;

public class ListIteration {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        //System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if(item.startsWith("B")) {
                iterator.remove(); 
            }
            
            //System.out.println(item);
            System.out.println(list);
        }
    }
}
