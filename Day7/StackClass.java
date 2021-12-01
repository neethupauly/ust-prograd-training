package list;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stk= new Stack<String>();
        stk.push("apple");
        stk.push("orange");
        stk.push("kiwi");

//        System.out.println(stk.peek()); //peek-top element
        stk.pop();
        System.out.println(stk);
        System.out.println(stk.indexOf("apple"));

    }
}
