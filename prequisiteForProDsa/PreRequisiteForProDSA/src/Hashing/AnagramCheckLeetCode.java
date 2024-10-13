//https://leetcode.com/problems/valid-anagram/description/
package Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheckLeetCode {
    public static void main(String[] args) {
        String str1 = "INDIA";
        String str2 = "AGNI";
        System.out.println(Brute(str1, str2));
        System.out.println(LessOptimized(str1, str2));
        System.out.println(MostOptimized(str1, str2));
    }

    private  static  boolean Brute(String str1, String str2){
        char[] temp1 = str1.toCharArray();
        char[] temp2 = str2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);

        return Arrays.equals(temp1, temp2);

        //O(nLogN), Not optimized
    }


    private  static  boolean LessOptimized(String str1, String str2){
        if(str2.length() != str1.length()){
            return  false;
        }


        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();


        for (int i = 0; i < str2.length(); i++) {
            a.put(str1.charAt(i), a.getOrDefault(str1.charAt(i), 0));
            b.put(str2.charAt(i), a.getOrDefault(str2.charAt(i), 0));
        }


        for (char c = 'a'; c<='z'; c++){
            if(!a.getOrDefault(c, 0).equals(b.getOrDefault(c,0))){
                return  false;
            }
        }
        return true;

    }

    private static boolean MostOptimized(String str1, String str2){
        //very good Edge Case
        if(str2.length() != str1.length()){
            return  false;
        }


        HashMap<Character, Integer> umap = new HashMap<>();
        for(char c: str1.toCharArray()){
            if(umap.containsKey(c)){
                umap.put(c, umap.get(c) + 1);
            }else{
                umap.put(c, 1);
            }
        }

        //running a for loop to find whether the str2 is there in the str1 or not
        for(char c: str2.toCharArray()){
            if(umap.containsKey(c)){
                umap.put(c, umap.get(c) - 1);
            }else{
                return  false;
            }
        }
        return  true;

    }
}
