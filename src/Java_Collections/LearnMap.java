package Java_Collections;
import java.util.*;
public class LearnMap {
    public static void main(String[] args) {
//        Map<Integer , String> n1 = new HashMap<>();
//
//        n1.put(1 , "aditya");
//        n1.put(2, "ananya");
//        n1.put(3,"harsh");
//        n1.put(4,"rudra");
//        n1.put(5, "nijit");

//        System.out.println(n1);
//        System.out.println(n1.containsKey(3));
//        System.out.println(n1.containsValue("rudra"));
//        System.out.println(n1.isEmpty());

//        n1.put(3, "utkal");

//        n1.putIfAbsent(4 ,"yash");
//
//        System.out.println(n1);
//
//        //Iteration in MAP
//        for(Map.Entry<Integer , String> e : n1.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//        for(Integer key:n1.keySet()){
//            System.out.println(key);
//        }
//        for(String value:n1.values()){
//            System.out.println(value);
//
//        }




//TREE MAP

        Map<String, Integer> n1 = new TreeMap<>();

        n1.put("ZEDI", 1);
        n1.put("Nijit" , 2);
        n1.put("Harsh" , 3);
        n1.put("Ananya",4);
        n1.put("Rudra",5);
//        System.out.println(n1);

        n1.remove("Nijit");

        System.out.println(n1);
    }

}
