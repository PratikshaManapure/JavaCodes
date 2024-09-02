import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Double> st = new Stack<>();
        st.push(23.98);
        st.push(45.66);
        st.push(87.777);
        st.push(767.8728);

        Iterator<Double> it = st.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Performing different operations: ");
        System.out.println("Element which is deleted is: " + st.pop());
        System.out.println("Top of the stack is : " + st.peek());

    }

}