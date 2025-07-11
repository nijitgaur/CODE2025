package DSA;
import java.util.Scanner;


public class print1_to_n {
    void print(int n){
        if(n ==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        //int i = 0;
        print1_to_n obj = new print1_to_n();
        obj.print(n);
    }
}
