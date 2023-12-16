import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(4);
        stack.push(9);
        stack.push(11);
        stack.push(10);
        stack.printStack();
        stack.pop();
        System.out.println("top element after deleting: " + stack.peek());
    }
}