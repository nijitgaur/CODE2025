package DSA;
import java.sql.SQLOutput;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //No of elements in array
        System.out.print("Enter the numbers of elements : ");
        int n = sc.nextInt();
        //elements in array
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        //create a hashmap
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        //Fetching
        System.out.println("Enter the  numbers of queries: ");
        int q = sc.nextInt();
        while(q-- >0){
            System.out.println("enter your query");
            int number = sc.nextInt();
            System.out.println(number + " appears : " +map.getOrDefault(number, 0));
        }



    }
}
