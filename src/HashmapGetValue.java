import java.util.HashMap;

public class HashmapGetValue {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();

        //add elements
        hmap.put(1, "AA");
        hmap.put(2, "BB");
        hmap.put(3, "CC");
        hmap.put(4, "DD");

        //getting values from hashmap
        String val=hmap.get(4);
        System.out.println("The Value mapped to Key 4 is "+ val );

    }
}
