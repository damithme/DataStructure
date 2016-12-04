package org.geeksforgeeks.stack;

/**
 * Linked list based Stack implementation.
 *
 * Stack | Sort a stack using recursion.
 * http://www.geeksforgeeks.org/sort-a-stack-using-recursion/
 *
 * Created by Damith Ganegoda on 11/24/16.
 */

public class SortAStack {
    class StackNode {
        int data;
        StackNode next;
    }


    private StackNode root;

    /**
     * check Stack is empty or not.
     * @return boolean
     */
    public boolean isEmpty(){
        return this.root == null;
    }

    /**
     * Push a data to Stack.
     * @param data
     */
    public void push(int data){
        StackNode stackNode = new StackNode();
        stackNode.data = data;
        stackNode.next = root;

        this.root = stackNode;
        //System.out.println(String.format("%d pushed to stack.", data));
    }

    /**
     * Remove a data from Stack.
     * @return
     */
    public int pop(){
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        StackNode tempNode = this.root;
        this.root = tempNode.next;

        return tempNode.data;
    }

    /**
     * Get top value in Stack.
     * @return
     */
    public int top(){
        if (this.root == null) {
            return Integer.MIN_VALUE;
        }
        return this.root.data;
    }

    /**
     * sort the stack.
     * @param stack
     */
    public void sortStack(SortAStack stack){
        if (!stack.isEmpty()) {
            int tempData = stack.pop();
            sortStack(stack);
            sortedInsert(stack, tempData);
        }
    }

    public void sortedInsert(SortAStack stack, int data){
        if (stack.isEmpty() || data > stack.top()) {
            stack.push(data);
        }
        else {
            int temp = stack.pop();
            sortedInsert(stack, data);
            stack.push(temp);
        }
    }

    /**
     * print all elements in stack.
     */
    public void print(){
        StackNode node = this.root;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {

        SortAStack stack = new SortAStack();
        stack.push(39);
        stack.push(50);
        stack.push(10);
        stack.push(6);
        stack.push(4);
        stack.print();
        System.out.println("----------");
        stack.sortStack(stack);
        stack.print();
    }
}
