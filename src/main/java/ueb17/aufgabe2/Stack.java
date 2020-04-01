package ueb17.aufgabe2;

import java.util.ArrayList;

public class Stack<E> {

    private final ArrayList<E> stack;

    public Stack() {
        stack = new ArrayList<E>();
    }

    public void push(E element) {
        stack.add(element);
    }

    public E pop() {
        return stack.remove(stack.size() - 1);
    }

    public int getSize() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}


