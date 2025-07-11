package JavaTutorialsCWH;
import java.util.*;

public class N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inis=0;
        // Write your code here
        for(int i = 0 ; i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j =0;j<=inis;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
            inis +=2;
        }
//        int ini = 4;
//        for(int i = 0; i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("* ");
//            }
//            for(int j = 0;j<inis;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//            inis -=2;
//        }

    }
}
