package com.company;

class Stack {

    private int stackTop = 0;
    private char[] items;

    char getStackTop() {
        if (!isStackEmpty()) {
            return items[stackTop-1];
        }
        return 0;
    }

    void createStack(int max) {
        items = new char[max];
    }

    boolean isStackEmpty() {
        return stackTop == 0;
    }

    private boolean isStackFull() {
        return items.length == stackTop;
    }

    void addToStack(char newItem) {
        if (!isStackFull()) {
            items[stackTop] = newItem;
            stackTop++;
        } else {
            System.out.println("The stack is full.");
        }
    }

    void removeFromStack() {
        if (!isStackEmpty()) {
            items[stackTop-1] = 0;
            stackTop--;
        } else {
            System.out.println("The stack is empty.");
        }
    }
}
