package org.geeksforgeeks.stack;

/**
 * Implement Stack using array.
 *
 * Stack | Set 1 (Introduction)
 * http://quiz.geeksforgeeks.org/stack-set-1/
 *
 * Created by DAM on 11/22/16.
 */
public class Stack1 {

    private int top;
    private int capacity;
    private int[] array;

    public Stack1(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public boolean isFull(){
        return this.top == this.capacity - 1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void push(int value){
        if (this.isFull()) {
            return;
        }
        this.array[++this.top] = value;
        System.out.println(String.format("%d pushed to stack.", value));
    }

    public int pop(){
        if (this.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.top--];
    }

    public int peek(){
        if (this.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.top];
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(String.format("%d popped from stack", stack.pop()));
        System.out.println(String.format("%d peeked from stack", stack.peek()));

    }
}
