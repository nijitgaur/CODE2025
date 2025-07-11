package JavaTutorialsCWH;
import java.util.Scanner;

public class Cwh_03_Exercise1 {
    public static void main(String[] args) {
//        EXAM MARKS CALCULATOR
        int n = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1: ");
        int a = sc.nextInt();
        System.out.println("Enter the marks of subject 2: ");
        int b = sc.nextInt();
        System.out.println("Enter the marks of subject 3: ");
        int c = sc.nextInt();
        System.out.println("Enter the marks of subject 4: ");
        int d = sc.nextInt();
        System.out.println("Enter the marks of subject 5: ");
        int e = sc.nextInt();


        float sum = a+b+c+d+e;
        float percent = (sum/n) *100;

        System.out.println("The percentage of the students is: "+ percent);


    }
}
