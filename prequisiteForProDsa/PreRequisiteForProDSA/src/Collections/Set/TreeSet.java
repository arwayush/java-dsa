package Collections.Set;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> st = new java.util.TreeSet<>();
        //set properties as well as keep the set sorted in backend
        //BST is being implemented in the backend
        st.add(23);
        st.add(1234);
        st.add(23);
        st.add(23);
        st.add(56);
        st.add(90);
        st.add(67);
        st.add(89);

        System.out.println(st);
        //output of the set is of the random order
        st.remove(54); //used to remove the element, does not gives the exception if element is not present
        System.out.println(st);
        System.out.println(st.contains(100));//returns as true or false if set contains the given number or not
        System.out.println(st.isEmpty()); //returns as true or false if the set is empty or not
        System.out.println(st.size()); //give the size of the set
        st.clear(); //removes all the elments of set
        System.out.println(st);

        //All the operations are done at the T.C of O(logN), beacause of the internal working of BST
    }
}
