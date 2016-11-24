package org.geeksforgeeks.stack;

/**
 * Linked list based Stack implementation.
 *
 * Stack | Set 1 (Introduction)
 * http://quiz.geeksforgeeks.org/stack-set-1/
 *
 * Created by DAM on 11/24/16.
 */
class StackNode {
    int data;
    StackNode next;
}
public class Stack2 {

    private StackNode root;

    public boolean isEmpty(){
        return this.root == null;
    }

    public void push(int data){
        StackNode stackNode = new StackNode();
        stackNode.data = data;
        stackNode.next = root;

        this.root = stackNode;
        System.out.println(String.format("%d pushed to stack.", data));
    }

    public int pop(){
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        StackNode tempNode = this.root;
        this.root = tempNode.next;

        return tempNode.data;
    }

    public int peek(){
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return this.root.data;
    }

    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(String.format("%d popped from stack.", stack.pop()));
        System.out.println(String.format("%d peeked from stack.", stack.peek()));
    }
}


