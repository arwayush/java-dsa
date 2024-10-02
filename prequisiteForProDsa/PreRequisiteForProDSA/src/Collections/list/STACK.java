package Collections.list;

import java.util.Stack;

public class STACK {
    public static void main(String[] args) {
        //Stack also comes under the List interface
        //works on Last in first out (LIFO)
        Stack<String> animals = new Stack<>(); //to create an stack inside the memory
        animals.push("Lion"); //to push the elements in the stack
        animals.push("Chetak");
        animals.push("Dino");

        System.out.println(animals);

        System.out.println(animals.peek()); //used to see the uppermost elemtent of the stack
        animals.pop(); //used to remove the uppermost element of the stack
        System.out.println(animals);


    }
}
