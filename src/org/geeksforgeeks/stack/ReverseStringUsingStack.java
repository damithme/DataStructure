package org.geeksforgeeks.stack;

/**
 * Reverse string using stack.
 *
 * Stack | Set 3 (Reverse a string using stack)
 * http://quiz.geeksforgeeks.org/stack-set-3-reverse-string-using-stack/
 *
 * Created by DAM on 11/28/16.
 */
public class ReverseStringUsingStack {

    private int top;
    private int capacity;
    private char[] array;

    public ReverseStringUsingStack(int capacity){
        this.capacity = capacity;
        this.array = new char[capacity];
        this.top = -1;
    }

    /**
     * check stack is full or not.
     * @return
     */
    public boolean isFull(){
        return this.top == this.capacity - 1;
    }

    /**
     * check stack is empty.
     * @return
     */
    public boolean isEmpty(){
        return this.top == -1;
    }

    /**
     * stack push.
     *
     * @param value
     */
    public void push(char value){
        if (this.isFull()) {
            return;
        }
        this.array[++this.top] = value;
    }

    /**
     * stack pop.
     *
     * @return
     */
    public char pop(){
        if (this.isEmpty()) {
            return '\u0000';
        }
        return this.array[this.top--];
    }

    /**
     * reverse given string.
     *
     * @param str
     * @return
     */
    public static String reverse(String str){
        char[] charArr = str.toCharArray();
        int size = charArr.length;

        ReverseStringUsingStack stack = new ReverseStringUsingStack(size);

        for (int i=0; i < size; i++) {
            stack.push(charArr[i]);
        }

        for (int i=0; i < size; i++) {
            charArr[i] = stack.pop();
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        String str = "GeeksQuiz";
        System.out.println(reverse(str));
    }
}
