package DSA;

import java.util.Scanner;

public class printn_to_1b {
    void print(int i,int n){
        if(i>n){
            return;
        }
        print(i+1,n);
        System.out.println(i+" ");




    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        printn_to_1b obj = new printn_to_1b();
        obj.print(1,n);
    }
}
