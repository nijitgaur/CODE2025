package Java_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        System.out.println(Collections.frequency(list , 4));


    }
}
