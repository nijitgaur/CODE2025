package Java_Collections;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();

        a.offer(23);
        a.offerFirst(56);
        a.offerLast(56);
        a.offer(45);

//        System.out.println(a);

//        System.out.println(a.peekFirst());
//        System.out.println(a.peekLast());
//
//        System.out.println(a.pollFirst());
//        System.out.println(a);
//
//        System.out.println(a.pollLast());
//        System.out.println(a);

        ArrayDeque<Integer> b = new ArrayDeque<>();

        b.offer(56);
        b.offer(34);
        b.offer(54);
        b.offer(78);
        b.offer(34);

        System.out.println(b);

        System.out.println(b.pollLast());
        System.out.println(b);


    }
}
