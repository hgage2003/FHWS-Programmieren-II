package ueb22.aufgabe1;

import java.util.Arrays;
import java.util.List;

public class BBruder {
  private String name;
  private int bankDrueckenGewicht;
  private int knieBeugenGewicht;

  private BBruder(String name, int bankDrueckenGewicht, int knieBeugenGewicht) {
    this.name = name;
    this.bankDrueckenGewicht = bankDrueckenGewicht;
    this.knieBeugenGewicht = knieBeugenGewicht;
  }
   
  @Override
  public String toString() {
    return String.format(
      "Name: %s, Bankdrücken: %dkg, Kniebeugen %dkg",  
      name, bankDrueckenGewicht, knieBeugenGewicht);
  }
  
  public static void main(String[] args) {
    List<BBruder> bBrothers = Arrays.asList (
	    new BBruder("Burt", 238, 311),  
	    new BBruder("Bronski", 200, 274),
	    new BBruder("Bruno", 236, 328));
    
    //a.)
    String liste = bBrothers.stream()
	    .map(s1 -> s1.name)
	    .reduce("", (s1, s2) -> (s1.isEmpty() ? s2 : s1 + "," + s2));
    System.out.println(liste);
    
    //b.)
    double d = bBrothers.stream()
	    .mapToDouble(b -> b.bankDrueckenGewicht)
	    .average()
	    .orElse(0.0);
    System.out.println(d);
  }
  
}
