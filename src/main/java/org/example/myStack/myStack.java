package org.example.myStack;

public class myStack implements StackImplementation {
    Integer arr[];
    int size;
    int index;

    public myStack(int size) {
        this.size = size;
        this.index = -1;
        this.arr = new Integer[size];
    }

    public myStack(Integer[] arr) { //1,5,4,0,0,0,0,0,0,0
        this.arr = arr;
        this.size = arr.length;
        this.index = getIndex(arr);
    }


    public Integer getIndex(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i - 1;
            }
        }
        return arr.length - 1;
    }


    @Override
    public void push(Integer element) {
        if (!isFull()) {
            arr[++index] = element;
        } else {
            System.out.println("No more space.The stack is full");
        }
    }

    @Override
    public Integer pop() {
        if (!isEmpty()) {
            int element = arr[index];
            arr[index--] = 0;
            return element;
        }
        System.out.println("Unable to return element");
        return 0;
    }

    @Override
    public Integer peek() {
        return arr[index];
    }

    @Override
    public Integer size() {
        return index + 1;
    }

    @Override
    public boolean isEmpty() {
        return index == -1;
    }

    @Override
    public boolean isFull() {
        return index == size - 1;
    }

    public void print() {
        for (Integer a : arr) {
            System.out.print(a + " ");

        }
        System.out.println();
    }

}