package ueb14.aufgabe3;

import java.util.ArrayList;

public class StackComposition {
    ArrayList<Object> al;

    public StackComposition() {
        al = new ArrayList<>();
    }

    public void push(Object e) {
        al.add(e);
    }

    public void pop() {
        al.remove(al.size() -1 );
    }

    public int getSize() {
        return al.size();
    }

    public static void main(String[] args) {
        StackComposition s = new StackComposition();
        s.push("hi");
        s.push(2);

        System.out.println(s.getSize());

        s.pop();
        System.out.println(s.getSize());
    }
}
