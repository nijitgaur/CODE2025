package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        int a = 52;
        int b = 10;
        int c = a;
        int d = b;
        List<Integer> list = new ArrayList<>();
        while(a>0 && b>0){
            if(a>b)  a =a % b;
            else b = b % a;
        }
       if(a==0){
           list.add(b);
       }
       else{
           list.add(a);
       }


    }
}
