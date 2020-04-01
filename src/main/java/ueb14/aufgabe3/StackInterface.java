package ueb14.aufgabe3;

import java.util.ArrayList;

public class StackInterface implements IStack {

    ArrayList<Object> al = new ArrayList<>();

    @Override
    public void push(Object e) {
        al.add(e);
    }

    @Override
    public void pop() {
        al.remove(al.size() - 1);
    }
}
