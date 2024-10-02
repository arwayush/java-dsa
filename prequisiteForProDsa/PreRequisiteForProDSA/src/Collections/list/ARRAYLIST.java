package Collections.list;
import java.util.*;
public class ARRAYLIST {
    public static void main(String[] args) {
        //Comes under the List interface
        ArrayList<Integer> aList = new ArrayList<>(); //on declaring there creates an empty array inside the memory, because ArrayList internally works on array
        //adding something
        aList.add(34); //adds the element at the last position, initially the size of array is "n"
        aList.add(45);
        aList.add(56);
        //now the arraylist is full, so, size it creates a new array of size like n + n/2 + 1;
        //old array is copied into the new array and old array is dumped
        System.out.println(aList);
        //to add at the position at any index, give two parameters one is index and other is element
        aList.add(2,495);
        //to add a new List to current list
        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(345);
        aList.addAll(newList); //newList is being added to the newList


        System.out.println(aList);

        //getting the element at any index
        aList.get(2);

        //Removing the element
        aList.remove(0); //removes the element at any index which is specified
        aList.remove(Integer.valueOf(45)); // this will remove the element whose value is 45
        System.out.println(aList);//while printing a list internally it uses toString() method to print

        //to remove the full List
      //  aList.clear();//clears all the element inside the list
        //when removing any element there is O(n) -> T.C. because all element is being shifted internally
        //whenever adding an element at specific position O(n) -> T.C. because only one element is being triggerd again shfting needs to be done


        //to update the element at any position
        aList.set(1, 100); //works on O(1)

        aList.contains(100); //does it contains 100, gives the output as true or false

        //to iterate over an ArrayList, while doing some operations, etc.
        for (int i = 0; i < aList.size(); i++) {
            System.out.println("Elements are:" +aList.get(i));
        }

        //forEach loop
        for (Integer element : aList){
            System.out.println("Elements through forEach are:" +element);
        }

        //Iterator
        Iterator<Integer> it = aList.iterator();
        while (it.hasNext()){
            System.out.println("Iterator:" +it.next());
        }


    }
}
