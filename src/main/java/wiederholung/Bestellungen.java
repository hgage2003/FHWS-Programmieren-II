package wiederholung;

public class Bestellungen {
	private Artikel[] artikel = null;
	private int bestellnr;
	
	public Bestellungen(Artikel[] artikel, int bestellnr) {
		if (artikel.length<=50) {
			this.artikel = artikel;
		}
		this.bestellnr = bestellnr;
	}
	
	public int getBestellnr() {
		return this.bestellnr;
	}
	public void einfuegen(Artikel artikel) {
		for (int i = 0;i<this.artikel.length;i++) {
			if (this.artikel[i]==null) {
				this.artikel[i] = artikel;
				return;
			}
		}
	}
	public void loeschen(Artikel artikel) {
		for (int i = 0;i<this.artikel.length;i++) {
			if (this.artikel[i].getArtikelnr()==artikel.getArtikelnr()) {
				this.artikel[i]=null;
				return;
			}
		}
	}
	public void print() {
		
		for (int i = 0;i<this.artikel.length;i++) {
			if (this.artikel[i]!=null) {
				System.out.println(this.artikel[i].getArtikelnr());
			} else {
				System.out.println("null");
			}
		}
	}
	
	public static void main(String[] args) {
		Artikel[] artikelliste = new Artikel[50];
		Bestellungen bestellung = new Bestellungen(artikelliste,123);
		
		Artikel testA1 = new Artikel(1,"test1");
		bestellung.einfuegen(testA1);
		Artikel testA2 = new Artikel(2,"test2");
		bestellung.einfuegen(testA2);
		Artikel testA3 = new Artikel(3,"test3");
		bestellung.einfuegen(testA3);
		
		bestellung.loeschen(testA1);
		
		Artikel testA4 = new Artikel(4,"test4");
		bestellung.einfuegen(testA4);
		
		bestellung.print();
	}
	
	/* Probleme Array:
	 * Feste Größe
	 * Lücke im Array, wenn Artikel gelöscht wird
	 * Rechenaufwand beim Sortieren
	 */
	
	/* Probleme Liste:
	 * Es könnten mehr als 50 Artikel angelegt werden
	 */
}
