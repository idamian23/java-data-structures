package org.example;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);

        System.out.println(  stack.peek());
        System.out.println(  stack.size());
        System.out.println(  stack.pop());


    }
}
