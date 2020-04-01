package ueb21.aufgabe2;

import java.util.*;

public class Kreuzwortraetsel {
    
  static String[] alleWoerter = {
	"Bienenschwarm", "Buch", "Bibel",  
	"Beige", "Barriere", "Bein", "Beil", "Christ", "Christian",  
    	"Carmen"
  };  
   
  public static void main(String[] args) {

      TreeSet<String> t1 = new TreeSet<>(Comparator //Construct TreeSet with a Comparator
	      .comparing(String::length)
	      .thenComparing(String::compareTo));
      
      t1.addAll(Arrays.asList(alleWoerter));

      for (String wort : t1)
	  System.out.println(wort);
  }
}