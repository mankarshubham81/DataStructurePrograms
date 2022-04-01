import java.util.Stack;

// package Stack;

public class MyStack {
    public static void main(String[] args) {
        // InBuilt Stack 
        Stack<Integer> miStack = new Stack<>();
        
        miStack.push(4);
        miStack.push(3);
        miStack.push(2);
        miStack.push(1);

        
        System.out.println(miStack);
        System.out.println(miStack.pop());
        System.out.println(miStack.toString());
        System.out.println(miStack.pop());
        System.out.println(miStack);
        System.out.println(miStack.peek());
    }
}
