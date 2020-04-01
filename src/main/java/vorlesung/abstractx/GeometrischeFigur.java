package vorlesung.abstractx;

public abstract class GeometrischeFigur {
    String text;
		
    public abstract double berechneFlaeche();
		
    public String getText() {
	return text;
    }
    
    public void setText(String text) {
	this.text= text;
    }
}
