package org.example.myStack;

public class Main {
    public static void main(String[] args) {
        myStack oneStack = new myStack(10);
        myStack twoStack = new myStack(new Integer[]{5, 3, 7, 0, 14, null, null, null, null, null});
        System.out.println(twoStack.index);
        twoStack.push(25);
        twoStack.push(33);
        twoStack.push(4);
        twoStack.push(8);
        twoStack.print();
        // System.out.println(twoStack.index);
        System.out.println(twoStack.size());
        System.out.println(twoStack.isFull());
        twoStack.pop();
        twoStack.pop();
        twoStack.pop();
        twoStack.pop();
        twoStack.pop();
        twoStack.pop();
        twoStack.pop();
        twoStack.pop();
        twoStack.pop();
        twoStack.print();
        // System.out.println(twoStack.index);
        System.out.println(twoStack.size());
        System.out.println(twoStack.isEmpty());
//        System.out.println(oneStack.peek());
//        System.out.println(oneStack.size);
//        oneStack.pop();
//        oneStack.pop();
//        System.out.println(oneStack.size);
//        System.out.println(oneStack.index);
//        System.out.println(oneStack.isFull());
//        oneStack.print();
    }

}
