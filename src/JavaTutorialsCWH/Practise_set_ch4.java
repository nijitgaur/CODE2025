package JavaTutorialsCWH;

import java.util.Scanner;

public class Practise_set_ch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem 1
//
//        System.out.println("Enter your numbers: ");
//        int suba = sc.nextInt();
//        int subb = sc.nextInt();
//        int subc = sc.nextInt();
//
//
//
//        int sum = suba+subb+subc;
//        float percent  = (sum/300.0f)*100;
//
//        if(percent>40 && suba>33 && subb>33 && subc>33){
//            System.out.printf("You have passed this semester with %.2f%%\n", percent);
//        }
//        else{
//            System.out.println("you have failed");
//        }

        //Problem 2
//        System.out.println("Enter you income in lakhs per annun");
//        float income = sc.nextFloat();
//        float tax =0;
//
//        if(income<2.5f){
//            System.out.println("no tax will be charged");
//        }
//        else if(income>2.5f && income<5.0f){
//            tax = tax + 0.05f*(income-2.5f);
//        }
//        else if(income>5.0f && income<10.0f){
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax + 0.2f*(income-5.0f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax + 0.2f*(10.0f-5.0f);
//            tax = tax+0.3f*(income-10.0f);
//        }
//        System.out.println("The tax of this financial year will be "+ tax);


        //Problem3
//        System.out.println("Enter the number");
//        int number = sc.nextInt();
//
//        switch(number){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Monday");
//                break;
//            case 4:
//                System.out.println("Monday");
//                break;
//            case 5:
//                System.out.println("Monday");
//                break;
//            case 6:
//                System.out.println("Monday");
//                break;
//            case 7:
//                System.out.println("Monday");
//                break;
//            default:
//                System.out.println("Invalid input");
//
//        }


        //Problem 4
//        System.out.println("enter your year");
//        int year = sc.nextInt();
//
//        if((year%4==0 && year%100!=0 ) || (year %400==0)){
//            System.out.printf("%d is a leap year",year);
//        }
//        else{
//            System.out.println("This is not a leap year");
//        }


        //Problem 5
        System.out.println("Enter the website: ");
        String web = sc.nextLine();

        if(web.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(web.endsWith(".org")){
            System.out.println("This is an organization website");
        }
        else if(web.endsWith(".in")){
            System.out.println("This is an indian website");
        }



    }
}
