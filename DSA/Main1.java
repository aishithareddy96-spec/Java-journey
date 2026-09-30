package DSA;
import java.util.Stack;

public class Main1 
{
    public static void main(String[] args) 
    {
        Stack<String> st = new Stack<>();
        st.push("JungKook");
        st.push("TaeHyung");
        st.push("Jimin");
        st.push("Pranaya Ammama");
        st.pop();
        st.peek();
        System.out.println(st.search("Jimin"));
        System.out.println(st);
    }
}
