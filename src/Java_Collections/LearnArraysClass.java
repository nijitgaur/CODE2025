package Java_Collections;
import java.util.*;
public class LearnArraysClass {
    public static void main(String[] args) {
         Integer[] a = {1,2,3,4,5,6,7,8,9};
         int index = Arrays.binarySearch(a,6);
        System.out.println(index);

        Integer[] b ={ 43,54,34,56,76,34,67,98,99};
        Arrays.sort(b);
        Arrays.fill(b,12);

        for(int i : b){
            System.out.println(i+ " ");
        }
//




    }
}
