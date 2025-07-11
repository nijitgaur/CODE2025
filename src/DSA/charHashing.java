package DSA;
import java.util.*;

public class charHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter the string(lowercase only): ");
        String s = sc.next();

        //creating hash array
        int[] hash = new int[26]; // if we do not talk about exclusivity , we can use 256n in place of 26
        // and we will not use --'a' in hash ans hashquuery 

        //precompputing
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            //if(ch >= 'a' && ch <= 'z' ){
                hash[ch - 'a']++;
            //}
//            else{
//                System.out.println("Invalid character added");
//            }

        }

        //no of queries
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();


        //fetching
        while(q-- >0){
            char querychar = sc.next().charAt(0);
           // if(querychar >= 'a' && querychar <= 'z'){
                System.out.println("Frequncy of "+ querychar+ " is: "+hash[querychar-'a']);
            //}
//            else{
//                System.out.println("Invalid query entered ");
//            }
        }
        

    }
}
