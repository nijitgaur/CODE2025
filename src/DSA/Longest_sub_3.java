package DSA;

import java.util.Scanner;

public class Longest_sub_3 {
    public static void subarr(int[] arr , int k ) {
        int len = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j<n;j++ ){
                sum += arr[j];
                if(sum == k){
                    len = Math.max(len , j-i+1);
                }
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sum : ");
        int k = sc.nextInt();
        System.out.println("enter the number of elements in array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter" + n+" elements in array");
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        subarr(arr,k);
    }
}
