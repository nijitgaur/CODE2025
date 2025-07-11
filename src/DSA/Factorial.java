package DSA;
import java.sql.SQLOutput;
import java.util.*;

class Solution{
    int factorial(int n){


    if( n==0 || n ==1) return 1;

    return n* factorial(n-1);
    }
}
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.factorial(n);
        System.out.println(result);
        
    }

}
