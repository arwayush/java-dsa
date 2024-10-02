package Map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> mp = new java.util.TreeMap<>();
        //keys being sorted by using BST, binary search tree
        mp.put("Ayush", 23); // to put the key and Value
        mp.put("Sara Jay", 48);
        mp.put("Ryan Conner", 56);
        System.out.println(mp);
        //all operations will be on O(logN)
        mp.remove("Sara Jay");
        System.out.println(mp);

    }
}
