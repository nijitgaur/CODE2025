package DSA;

public class Hashing1 {
    public static void main(String[] args) {
         int[] arr= { 1,2,3,2,1};

         int MAX = 12;

         int[] hash = new int[MAX+1];

         for(int i = 0;i < arr.length;i++){
             if(arr[i] >= 0 && arr[i]<= MAX){
                 hash[arr[i]]++;
             }
             else{
                 System.out.println("Invalid number"+ i);
             }
         }
        System.out.println("Frequenc of 3 is :"+ hash[3]);
        System.out.println("Frequenc of 1 is : "+ hash[1]);
        System.out.println("Frequenc of 2 is :"+ hash[2]);
        System.out.println("Frequenc of 5 is : "+ hash[5]);
        System.out.println("Frequenc of 12 is : "+ hash[12]);

    }
}
