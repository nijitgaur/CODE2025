package DSA;

import java.util.Scanner;

public class Quick_sort {
    public void qs(int[] arr , int low , int high){
        if (low < high) {
            int partition = quick(arr,low,high);
            qs( arr, low ,  partition-1);
            qs( arr,  partition+1,high);
        }
    }

    public int quick(int[] arr , int low , int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j){
            while(arr[i] <= pivot && i<=high-1){
                i++;
            }while(arr[j] > pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n+" elements in array");
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Quick_sort obj = new Quick_sort();
        obj.qs(arr,0,n-1);
        System.out.println("The sorted array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
