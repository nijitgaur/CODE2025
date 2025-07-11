package DSA;

public class Recursion1 {
    int count = 0;
    public void print(){

        if(count ==20){
            return;
        }
        else{
        System.out.println(count);
        count++;
        print();
        }
    }
    public static void main(String[] args) {
        Recursion1 obj = new Recursion1();
        obj.print();

    }
}
