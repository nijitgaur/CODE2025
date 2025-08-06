package JavaTutorialsCWH;

import java.util.Scanner;

public class Methods {
    public static int sum(int a,int b){
        int z=0;
        if(a<b){
             z =a+b;
        }
        else if(a>b){
            z = (a+b)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a,b);
        System.out.println(result);


    }
}
