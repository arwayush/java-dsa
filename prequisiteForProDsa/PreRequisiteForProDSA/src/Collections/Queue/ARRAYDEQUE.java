package Collections.Queue;

import java.util.ArrayDeque;

public class ARRAYDEQUE {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        //In the array deque elements can be inserted and deleted from both the sides, front and back
        // All the operations can be done from both the sides
        // There can be mulltiple scenarios in which arrayDeque can be used
        // It uses the basic functions of queue as well as It also have some functions or methods of itself also
        //Eg: Sliding window
        // ArrayDeque is also a class

        adq.offer(34); //put the element @ the last
        adq.offerFirst(12);//put the element in the starting of the deque
        adq.offerFirst(455);
        adq.offerFirst(700);
        adq.offerLast(333); //put the element at the last
        System.out.println(adq);


        //peek functions
        System.out.println(adq.peek()); //front element
        System.out.println(adq.peekFirst()); //front element
        System.out.println(adq.peekLast()); //last element

        //poll functions
        System.out.println(adq.poll()); //remove the first
        System.out.println(adq.pollFirst()); //removes the first
        System.out.println(adq.pollLast()); //removes the last

        System.out.println(adq);





    }
}
