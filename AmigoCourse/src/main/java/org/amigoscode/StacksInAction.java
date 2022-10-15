package org.amigoscode;

import java.util.Stack;

public class StacksInAction {

    public static void main(String[] args) {
        // Stacks
        // Stack is like pringles and has stack of chips inside
        // you can deal with the surface chip
        // LIFO last in first out
        Stack<Integer> stacks1 = new Stack<>();

        stacks1.push(0);
        stacks1.push(2);
        stacks1.push(3);
        stacks1.push(4);
        System.out.println(stacks1.peek());
        // 4 - peek get the top of the stack which is the last element

        stacks1.pop();
        System.out.println(stacks1);
        // [0, 2, 3] -- pop remove the top of the stack


    }

}
