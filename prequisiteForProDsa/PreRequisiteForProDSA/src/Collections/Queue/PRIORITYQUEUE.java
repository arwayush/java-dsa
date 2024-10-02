package Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PRIORITYQUEUE {
    public static void main(String[] args) {
        //implementing the queue, while giving the priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
         pq.offer(40);
         pq.offer(12);
         pq.offer(24);
         pq.offer(36 );

        System.out.println(pq);
        //there is the change in order of the elements entered because internally minHeap is working
        pq.poll();//gives the output of the element with most priority
        System.out.println(pq); //

        //Comparator.reverseOrder() -> this function will convert the by default minHeap to maxHeap
        pq.offer(120);
        pq.offer(890);
        pq.offer(3);
        System.out.println(pq.poll()); //now we will get the max element



    }
}
