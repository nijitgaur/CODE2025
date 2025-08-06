package JavaTutorialsCWH;

public class Methodoverloading {
    static void print(){
        System.out.println("HEYYYYYYY");
    }
    static void print(int a ){
        System.out.println("Hey  Nigga"+ a);
    }
    static int print(int a ,int b){
        System.out.println("Hey nigga nigga ");
        return 25;
    }

    public static void main(String[] args) {
        print();
        print(24);
        print( 36,32);
    }
}
