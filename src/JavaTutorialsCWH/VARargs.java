package JavaTutorialsCWH;

public class VARargs {
    static int sum(int ...arr){
        int res  = 0 ;
        for(int a : arr){
            res += a;
        }
        return  res;
    }

    public static void main(String[] args) {
        System.out.println("sum of 1,2 : "+ sum(1,2));
        System.out.println("sum of 1,2,3 : "+ sum(1,2,3));
        System.out.println("sum of 1,2,4,3 : "+ sum(1,2,4,3));
        System.out.println("sum of 1,2,3,4,5 : "+ sum(1,2,3,4,5));

    }
}
