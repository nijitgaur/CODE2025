package Java_Collections;
import java.util.*;
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(13);
        queue.offer(25);
        queue.offer(56);
        queue.offer(34);

        System.out.println(queue);

        //to remove an element in queue
        int b = queue.poll();
        System.out.println(b);

        System.out.println(queue.peek());
        System.out.println(queue);


        //Queue exception throwing methods : element , remove, add
        Queue<Integer> queue2 = new LinkedList<>();

        queue2.offer(21);

        System.out.println(queue2.element());
    }
}
