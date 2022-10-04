package VideoHw;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        /*
        The Stack class represents a last-in-first-out stack of objects
        It extends class vector with five operations that allow a vector to be treated as a stack
        The usual push and pop operations are provided,
        as well as a method to peek opeartions are provided,
        as well as a method to peek at the top item on the stack
        a method to test for wether the stack is empty, and a method
        to search the stack for an item and discover how far it is from the top

         */
        Stack<Integer> stack = new Stack<>();
        //methods
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        //removes
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}
