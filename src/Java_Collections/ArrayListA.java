package Java_Collections;
import java.util.*;

public class ArrayListA {
    public static void main(String[] args) {
//        ArrayList<String> studentname = new ArrayList<>();
//        studentname.add("Nijit");
//        studentname.add("aditi");
//        studentname.add("harshit");
//        studentname.add("ananya");
//        System.out.println(studentname);


        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);

        list.add(1,9);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list.add(60);
        list.add(50);
        list.add(19);
        //Adding a complele list
        list.addAll(list1);
        System.out.println(list);
        //getting a element
        System.out.println(list.get(2));

        // Removing an element
        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(1));
        System.out.println(list);

        list.set(2,500);
        System.out.println(list);

        for(int i =0;i<list.size();i++){
            System.out.println("element of index "+i+" is "+list.get(i));
        }

        for(Integer element: list){
            System.out.println("Element using for each list is :"+element);
        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println("Iterated element is "+ it.next());
        }

    }
}
