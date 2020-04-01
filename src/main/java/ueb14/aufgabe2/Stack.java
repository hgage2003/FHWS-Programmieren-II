package ueb14.aufgabe2;

import java.util.ArrayList;

@SuppressWarnings("all") //unterdrueckt alle Warnings
public class Stack extends ArrayList {

	public void push(Object e) {
		this.add(e);
	}

	public void pop() {
		this.remove(this.size() - 1);
	}

	public static void main(String[] args) {
		String s = "hallo";
		Integer i = 2;
		Stack stack = new Stack();

		stack.push(s);
		stack.push(i);
		for(Object e : stack) {
			System.out.println(e);
		}

		stack.pop();
		for(Object e : stack) {
			System.out.println(e);
		}
	}
}
