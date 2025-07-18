package org.example;

public class DishStack {
    private Dish[] stackArray;
    private int size;
    private int top;

    public DishStack(int maxSize) {
        stackArray = new Dish[maxSize];
        size = 0;
        top = -1;  // Start is empty
    }

    // Push a dish onto the stack
    public void push(Dish dish) {
        if (size < stackArray.length) {
            stackArray[++top] = dish;
            size++;
        } else {
            System.out.println("Stack is full, cannot push the dish.");
        }
    }

    // Pop a dish from the stack
    public Dish pop() {
        if (size > 0) {
            Dish poppedDish = stackArray[top--];
            size--;
            return poppedDish;
        } else {
            System.out.println("Stack is empty, cannot pop.");
            return null;
        }
    }

    // Peek at the dish on top of the stack without popping it
    public Dish peek() {
        if (size > 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty, cannot peek.");
            return null;
        }
    }

    // Get the current size of the stack
    public int size() {
        return size;
    }
}
