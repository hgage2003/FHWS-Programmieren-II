package ueb19.aufgabe1;

public class Naehrstoffangabe {

    int portionsgroesse, anzahlPortionen;
    double eiweiss, fett, kohlenhydrate, natrium;

    //Constructor Naehrstoffangabe
    private Naehrstoffangabe(int portionsgroesse, int anzahlPortionen, double eiweiss, double fett, double kohlenhydrate, double natrium) {
        this.portionsgroesse = portionsgroesse;
        this.anzahlPortionen = anzahlPortionen;
        this.eiweiss = eiweiss;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.natrium = natrium;
    }

    //Builder Class - Static!
    public static class NaehrstoffangabeBuilder {

        int portionsgroesse, anzahlPortionen;
        double eiweiss, fett, kohlenhydrate, natrium;

        //Constructor NaehrstoffangabeBuilder - Pflichtfelder
        public NaehrstoffangabeBuilder(int portionsgroesse, int anzahlPortionen) {
            this.portionsgroesse = portionsgroesse;
            this.anzahlPortionen = anzahlPortionen;
        }

        public NaehrstoffangabeBuilder withEiweiss(double eiweiss) {
            this.eiweiss = eiweiss;
            return this;
        }

        public NaehrstoffangabeBuilder withFett(double fett) {
            this.fett = fett;
            return this;
        }

        public NaehrstoffangabeBuilder withKohlenhydrate(double kohlenhydrate) {
            this.kohlenhydrate = kohlenhydrate;
            return this;
        }

        public NaehrstoffangabeBuilder withNatrium(double natrium) {
            this.natrium = natrium;
            return this;
        }

        public Naehrstoffangabe build() {
            return new Naehrstoffangabe(portionsgroesse, anzahlPortionen, eiweiss, fett, kohlenhydrate, natrium);
        }
    }//End Builder Class

    @Override
    public String toString() {
        return "Portionsgroesse: " + this.portionsgroesse + "\n" +
                "Anzahl Portionen: " + this.anzahlPortionen + "\n" +
                "Eiweißgehalt: " + this.eiweiss + "\n" +
                "Fettgehalt: " + this.fett + "\n" +
                "Kohlenhydrate: " + this.kohlenhydrate + "\n" +
                "Natriumgehalt: " + this.natrium;
    }

    public static void main(String[] args) {
        Naehrstoffangabe n = new Naehrstoffangabe.NaehrstoffangabeBuilder(1, 5)
                .withEiweiss(12.5)
                .withFett(0.5)
                .withKohlenhydrate(0.0)
                .withNatrium(8.6)
                .build();
        System.out.println(n.toString());
    }
}//End Class
