package Java_Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(46);
        pq.offer(25);
        pq.offer(56);
        pq.offer(34);

        System.out.println(pq);
        pq.poll();

        System.out.println(pq);


        Queue<Integer> pa = new PriorityQueue<>(Comparator.reverseOrder());

        pa.offer(21);
        pa.offer(35);
        pa.offer(23);
        pa.offer(12);

        System.out.println(pa);

        pa.poll();
        System.out.println(pa);

        pa.peek();
        System.out.println( pa.peek());
    }
}
