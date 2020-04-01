package ueb12.aufgabe4;

public class Strecke {
    int anfangspunkt;
    int endpunkt;

    public Strecke(int anfangspunkt, int endpunkt) {
        if(anfangspunkt > endpunkt) {
            int temp = anfangspunkt;
            this.anfangspunkt = endpunkt;
            this.endpunkt = temp;
        } else {
            this.anfangspunkt = anfangspunkt;
            this.endpunkt = endpunkt;
        }
    }

    public boolean ueberschneiden(Strecke s) {
        if(s.endpunkt > this.endpunkt) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Strecke s1 = new Strecke(3,5);
        Strecke s2 = new Strecke(4,4);

        System.out.println(s1.ueberschneiden(s2));
        System.out.println(s2.toString());
    }

    @Override
    public String toString() {
        String s;
        if(this.anfangspunkt == this.endpunkt) {
            return s = "" + this.anfangspunkt;
        }
        int abstand = this.endpunkt - this.anfangspunkt;
        s = "" + this.anfangspunkt;
        for(int i = 0; i < abstand; i++) {
            s += "-";
        }
        s += this.endpunkt;
        return s;
    }
}
