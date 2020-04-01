package ueb20.aufgabe5;

public interface Visitor<T> {
    public void visit(Baum.Knoten<T> current);
}
