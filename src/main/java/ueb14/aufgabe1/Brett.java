package ueb14.aufgabe1;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
  public Brett kombiniere(Brett uebergebenesBrett) {
	  
	Brett kombiniertesBrett = new Brett();
	
	for(int x = 1; x <= 8; x++) {
		for(int y = 1; y <= 8; y++) {
			if(this.gibFeld(x, y) || uebergebenesBrett.gibFeld(x, y)){
				kombiniertesBrett.markiereFeld(x, y);	
			}
		}	
	  } 
	  return kombiniertesBrett;
  }
}
