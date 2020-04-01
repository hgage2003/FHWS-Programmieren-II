package klausurvorbereitung.aufgabe9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MusikStueckSammlung {

    Map<String, MusikStueck> sammlung;
    
    public MusikStueckSammlung() {
	sammlung = new HashMap<>();
    }
    
    public void MusikStueckEinfuegen(MusikStueck neu) throws IllegalArgumentException {
	if(sammlung.containsKey(neu.getTitel())) {
	    throw new IllegalArgumentException("Musikstück mit dem Titel " + neu.getTitel() + " existiert bereits.");
	}
	sammlung.put(neu.getTitel(), neu);
    }
    
    public MusikStueck[] getAlleMusikStueckeNachTitel() {
	MusikStueck[] mArray = new MusikStueck[sammlung.size()];
	int i = 0;
	for(Map.Entry<String,MusikStueck> m : sammlung.entrySet()) {
	    mArray[i] = m.getValue();
	    i++;
	}
	
	Arrays.sort(mArray, new VergleicheMusikStueckTitel());
	return mArray;
    }
    
    public static void main(String[] args) {
	MusikStueck m1 = new MusikStueck("Bad","Michael Jackson",4);
	MusikStueck m3 = new MusikStueck("Sonne","Rammstein",5);
	MusikStueck m2 = new MusikStueck("Oops, I did it again","Britney Spears",3);

	MusikStueckSammlung ms = new MusikStueckSammlung();
	ms.MusikStueckEinfuegen(m1);
	ms.MusikStueckEinfuegen(m2);
	ms.MusikStueckEinfuegen(m3);
	
	for(Map.Entry<String, MusikStueck> map : ms.sammlung.entrySet()) {
	    System.out.println(map.getValue().toString());
	}
	System.out.println("////////////////////////////////////////////////////");
	for(MusikStueck m : ms.getAlleMusikStueckeNachTitel()) {
	    System.out.println(m.toString());
	}
    }
}