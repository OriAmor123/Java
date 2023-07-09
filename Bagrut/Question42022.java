package Bagrut;

import java.util.Stack;

public class Question42022 {
    public static boolean isExist(int num, Stack<Integer> stk) {
        Stack<Integer> stk2 = new Stack<>();
        int element;
        while (!stk.empty()) {
            element = stk.pop();
            stk2.push(element);
            if (lastDigit(element) == num) {
                while (!stk2.empty()) {
                    stk.push(stk2.pop());
                }
                return true;
            }
        }

        while (!stk2.empty()) {
            stk.push(stk2.pop());
        }
        return false;
        
    }

    public static boolean allExist(Stack<Integer> stk, Stack <Integer> stk2) { // stk=stk2
        while (!stk2.empty()) {
            if (!isExist(firstDigit(stk2.pop()), stk)) {
                return false;
            }
        }
        return true;

    }

    public static int lastDigit(int stkNum) {
        if (stkNum < 10) {
            return stkNum;
        }
        return lastDigit(stkNum % 10);
    }

    public static int firstDigit(int stkNum) {
        if (stkNum < 10) {
            return stkNum;
        }
        return firstDigit(stkNum/10);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(77);
        stk.push(33);
        stk.push(35);
        stk.push(562);
        stk.push(26);
        Stack<Integer> stk2 = new Stack<>();
        stk2.push(77);
        stk2.push(33);
        stk2.push(35);
        stk2.push(562);
        stk2.push(26);
        System.out.println(stk);
        System.out.println(stk.capacity());
        System.out.println(allExist(stk, stk2));
    }
}
