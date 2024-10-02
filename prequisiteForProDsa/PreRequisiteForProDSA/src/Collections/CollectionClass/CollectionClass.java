package Collections.CollectionClass;

import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(90);


        System.out.println(Collections.min(list));//gives us the minimum value
        System.out.println(Collections.max(list));//gives us the max value
        System.out.println(Collections.frequency(list,4));//gives us the frequency of the element in the list
        Collections.sort(list);//in ascending order
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
