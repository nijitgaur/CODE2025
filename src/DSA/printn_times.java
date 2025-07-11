package DSA;


import java.util.Scanner;

public class printn_times {
    void print(int i ,int n ){
        if(i>=n){
            return;
        }
        System.out.println("NIJIT");
        print(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want your name to be printed ");
        int n = sc.nextInt();
        int i =0;
        printn_times obj = new printn_times();
        obj.print(i,n);


    }
}
