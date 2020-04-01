package wiederholung;

public class Artikel {
	private int artikelnr;
	private String artikelname;
	
	public Artikel(int artikelnr, String artikelname) {
		this.artikelnr = artikelnr;
		this.artikelname = artikelname;
	}
	
	public int getArtikelnr() {
		return artikelnr;
	}
	public String getArtikelname() {
		return artikelname;
	}
	public void setArtikelnr(int artikelnr) {
		this.artikelnr = artikelnr;
	}
	public void setArtikelname(String artikelname) {
		this.artikelname = artikelname;
	}
	

}
