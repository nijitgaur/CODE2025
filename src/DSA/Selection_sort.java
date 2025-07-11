package DSA;


import java.util.Scanner;

public class Selection_sort {
    public void selection(int n , int[] arr ){
        for(int i = 0;i<=n-2;i++){
            int mini=i;
            for(int j = i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i]= temp;
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
        Selection_sort obj = new Selection_sort();
        obj.selection(n,arr);
        System.out.println("The sorted array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
