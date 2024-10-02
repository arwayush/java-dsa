package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LINKEDLIST {
    public static void main(String[] args) {
        //LinkedList in java comes under two interfaces 1->Queue     2->List
        //works as

        //array ka use queue


        //linked list ka use karke queue
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(23); //to put the elements in the queue, it will return as true if added successfully or false if not added succesfully
        qu.offer(33);
        qu.offer(78);

        System.out.println(qu);

        qu.poll(); //to remove and returnn the element
        qu.remove();//used to remove but gives an exception
        System.out.println(qu);

        System.out.println(qu.peek()); //element next in line which will come next, returns null if queue is empty
        System.out.println(qu.element()); //gives the next element in the queue, but will gives an exception if the queue is empty

        qu.add(90);  //this function will also the add the element in the queue but it will gives an exception, if operation is not successful
        System.out.println(qu);

    }
}
