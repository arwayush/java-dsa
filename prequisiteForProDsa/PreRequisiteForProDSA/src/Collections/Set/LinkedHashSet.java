package Collections.Set;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        //links the elements in the orders
        Set<Integer> st = new java.util.LinkedHashSet<>();
        //Elements will be in the order
        //although duplicates will still be not allowed
        //Contains the functionality of both the linkedlist as well as set

        st.add(23);
        st.add(23);
        st.add(23);
        st.add(56);
        st.add(90);
        st.add(67);
        st.add(89);

        System.out.println(st);
        //output of the set is of the order in which elements has been added
        st.remove(54); //used to remove the element, does not gives the exception if element is not present
        System.out.println(st);
        System.out.println(st.contains(100));//returns as true or false if set contains the given number or not
        System.out.println(st.isEmpty()); //returns as true or false if the set is empty or not
        System.out.println(st.size()); //give the size of the set
        st.clear(); //removes all the elments of set
        System.out.println(st);

    }
}
