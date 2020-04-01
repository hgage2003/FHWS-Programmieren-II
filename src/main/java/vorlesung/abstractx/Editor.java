package vorlesung.abstractx;

public class Editor {
    
    public GeometrischeFigur erzeugeRechteck(int laenge, int breite) {
	return new Rechteck(laenge, breite);
    }
	
    public void beschrifte(GeometrischeFigur figur, String text) {
	figur.setText(text);
    }
    
    public static void main(String[] args) {
	Editor editor= new Editor();
	GeometrischeFigur r = editor.erzeugeRechteck(10, 5);
	editor.beschrifte(r, "Hausfront");
    }
}
