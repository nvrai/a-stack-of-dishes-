package org.example;

public class App {
    public String getGreeting() {
        return "Hello! Thiis my Stack of Dishes Project!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        DishStack stack = new DishStack(4);  

        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        int stackSize = stack.size();
        System.out.println("Initial stack size: " + stackSize); // Size: 0

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        int sizeAfterPushes = stack.size();
        System.out.println("Size after pushes: " + sizeAfterPushes); // Size: 4

        Dish peekedDish = stack.peek();
        System.out.println("Peeked dish: " + peekedDish.description); 

        Dish poppedDish = stack.pop();
        System.out.println("Popped dish: " + poppedDish.description);

        Dish anotherPoppedDish = stack.pop();
        System.out.println("Another popped dish: " + anotherPoppedDish.description); 

        int finalSize = stack.size();
        System.out.println("Final stack size: " + finalSize); // Size: 2
    }
}
