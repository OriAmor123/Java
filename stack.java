import java.util.Stack;

public class stack {
    public static Stack<Integer> noBlockStack(Stack<Integer> stk) {
        Stack<Integer> newStack = new Stack<>();
        if (stk.empty()) { // * if the stack is empty, returns an empty stack
            return newStack;
        }
        int count = 1;
        int swapper = stk.pop();
        
        while (!stk.empty()) {
            if (swapper == stk.peek()) { // if the num is in the block
                count++;
            } else {
                if (count == 1) {
                    newStack.push(swapper);
                }
                count = 1;
            }
            swapper = stk.pop();
        }
        if (count == 1) {
            newStack.push(swapper);
        }
        return newStack;
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(2);
        stk.push(3);
        stk.push(5);
        stk.push(5);
        stk.push(7);
        stk.push(3);
        stk.push(9);
        stk.push(9);
        stk.push(1);
        System.out.println(stk);
        Stack<Integer> stk2 = noBlockStack(stk);
        System.out.println(stk2);
    }
    
    
}
