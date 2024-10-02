package Map;
import java.util.*;
public class MapOfJava {
    public static void main(String[] args) {
        Map<String ,Integer> mp = new HashMap<>();
        mp.put("Ayush", 23); // to put the key and Value
        mp.put("Sara Jay", 48);
        mp.put("Ryan Conner", 56);
        System.out.println(mp);
        //map can be used in multiple algorithms
        //Key will always be Unique, if you will put the same key with the different value than it will override
       // mp.computeIfAbsent("three", 3);


        //Iterating in the map
        for (Map.Entry<String,Integer> e: mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for( String value: mp.keySet()){
            System.out.println(value);
        }

        for (Integer val : mp.values()){
            System.out.println(val);
        }

        System.out.println(mp.containsValue(3));
        System.out.println(mp.containsKey("Ayush"));
        mp.clear();
        System.out.println(mp);
    }
}
