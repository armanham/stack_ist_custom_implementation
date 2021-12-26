package com.company;

public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");

        System.out.println(myStack.toString());
        System.out.println( "peek " + myStack.peek());
        System.out.println(myStack.search("3"));

    }
}
