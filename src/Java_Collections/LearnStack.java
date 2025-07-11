package Java_Collections;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("one");
        st.push("two");
        st.push("three");
        st.push("four");
        st.push("five");
        System.out.println("Stack: "+st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
}
