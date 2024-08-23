import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main (String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "India");
        map.put(2,"China");
        map.put(3,"Pakistan");
        map.put(4,"United States");
        System.out.println(map);
        map.put(5,"UK");
        System.out.println(map);
        if(map.containsKey(1)){
          System.out.println("Key is present");
        }
        else {
            System.out.println("Key is not present");
        }
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        for (Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }



      HashMap<String,Integer> map1 = new HashMap<>();
      map1.put("India",1);
      map1.put("China",2);
      map1.put("Pakistan",3);
      map1.put("United States",4);
      System.out.println(map1);
      System.out.println(map1.get("India"));
      System.out.println(map1.get("China"));
      System.out.println(map1.get("Pakistan"));

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }


    }
}
