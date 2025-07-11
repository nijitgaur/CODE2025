package DSA;

import java.util.Scanner;

public class printn_to1 {
    void print(int i ,int n){
        if(n <=i){
            return;
        }
        System.out.println(n+" ");
        print(i,n-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 0;
        printn_to1 obj = new printn_to1();
        obj.print(i,n);
    }
}
