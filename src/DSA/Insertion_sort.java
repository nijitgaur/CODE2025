package DSA;

import java.util.Scanner;

public class Insertion_sort {
    public void insertion(int[] arr,int n){
        for(int i =0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
                System.out.println("runs");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter" + n+" elements in array");
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Bubble_sort obj = new Bubble_sort();
        obj.bubble(arr,n);
        System.out.println("The sorted array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
