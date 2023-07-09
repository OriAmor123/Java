package Bagrut;

import java.util.Stack;

public class Question12010 {
    public static int highestSum(Stack<Integer> stk2) {
        int sum = 0;
        int num1 = stk2.pop();
        int num2;
        while (!stk2.empty()) {
            num2 = stk2.pop();
            if (num1 + num2 > sum) {
                sum = num1 + num2;
            }
            num1 = num2;
        }
        return sum;
    }

    public static int highestNearSum(Stack<Integer> stk1, Stack<Integer> stk2) {
        int stk2Sum = highestSum(stk2);
        int num1 = stk1.pop();
        int num2;
        while (!stk1.empty()) {
            num2 = stk1.pop();
            if(num1 + num2 > stk2Sum) {
                return num1 + num2;
            }
            num1 = num2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        stk1.push(7);
        stk1.push(6);
        stk1.push(14);
        stk1.push(8);
        stk1.push(12);
        stk1.push(9);
        stk1.push(7);

        stk2.push(11);
        stk2.push(9);
        stk2.push(1);
        stk2.push(4);
        stk2.push(13);
        stk2.push(4);
        stk2.push(8);
        stk2.push(2);
        System.out.println(highestNearSum(stk1, stk2));
    }
}
