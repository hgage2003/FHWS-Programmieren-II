package ueb20.aufgabe5;

public class Baum<E extends Comparable<E>> {
    public static class Knoten<E> {
        Knoten<E> left;
        Knoten<E> right;
        E content;
    }

    Knoten<E> root;

    public class MyVisitor<T> implements Visitor<T> {

        int anzahl = 0;

        @Override
        public void visit(Knoten current) {
            anzahl++;
        }

        public int getAnzahl() {
            return anzahl;
        }
    }

    public int size() {
        MyVisitor mv = new MyVisitor();
        traversiere(mv);
        return mv.getAnzahl();
    }

    public void einfuegen(E content){
        if(root == null){

            root = new Knoten<E>();
        }
        else{
            einfuegen(root, content);
        }
    }


    public void einfuegen(Knoten<E> current, E content) {
        if (current.right == null) {
            current.right = new Knoten<E>();
        } else if (current.left == null) {
            current.left = new Knoten<E>();
        } else {

            int wo = (int) (Math.random() * 2);
            if (wo == 0) {
                einfuegen(current.right, content);
            } else {
                einfuegen(current.left, content);
            }
        }
    }

    protected void traversiere(Visitor<E> visitor) {
        if (root == null) return;
        else traversiere(root, visitor);
    }

    protected void traversiere(Knoten<E> current, Visitor<E> visitor) {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }

    public static void main(String[] args) {
        Baum b = new Baum();
        b.einfuegen(123);
        b.einfuegen(1235);
        b.einfuegen(12);
        System.out.println(b.size());

    }
}