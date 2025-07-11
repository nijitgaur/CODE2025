package Java_Collections;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> a = new HashSet<>();
//        Set<Integer> a = new LinkedHashSet<>(); //works as a linked list where elements are saved orderly.

        Set<Student> student = new HashSet<>();

        student.add(new Student("nijit", 1));
        student.add(new Student("roshan", 2));
        student.add(new Student("preeet", 3));
        student.add(new Student("kalra", 1));

        System.out.println(student);

        Student s1 = new Student("harsh" , 45);
        Student s2 = new Student("rudra", 34);
        System.out.println(s1);

        System.out.println(s1.equals(s2));

//        a.add(25);
//        a.add(47);
//        a.add(78);
//        a.add(23);
//        a.add(34);
//
//        System.out.println(a);
//
//        System.out.println(a.remove(25));
//        System.out.println(a);
//
//        System.out.println(a.contains(78));
//
//        System.out.println(a.isEmpty());
//
//        System.out.println(a.size());
//
////        System.out.println(a.clear());
//        System.out.println(a);
    }
}
