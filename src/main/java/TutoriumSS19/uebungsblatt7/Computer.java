package TutoriumSS19.uebungsblatt7;

public class Computer {
    private int seriennr;
    private String hersteller;
    private int kernAnzahl = 1;
    private Betriebssysteme betriebssystem;

    private Computer(int seriennr, String hersteller, int kernAnzahl, Betriebssysteme betriebssystem) {
        this.seriennr = seriennr;
        this.hersteller = hersteller;
        this.kernAnzahl = kernAnzahl;
        this.betriebssystem = betriebssystem;
    }

    public void ausführe(Programm programm) {
        for (int i = 0; i < kernAnzahl; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(betriebssystem.sleeptime);
                } catch (InterruptedException e) {
                    System.out.println("Fehler");
                }
                programm.ausfuehren();
            }).start();
        }
    }

    public static class ComputerBuilder {
        private int seriennr;
        private String hersteller;
        private int kernAnzahl = 1;
        private Betriebssysteme betriebssystem;

        public ComputerBuilder(int seriennr, String hersteller) {
            this.seriennr = seriennr;
            this.hersteller = hersteller;
        }

        public ComputerBuilder withKernAnzahl(int kernAnzahl) {
            this.kernAnzahl = kernAnzahl;
            return this;
        }

        public ComputerBuilder withBetriebssystem(Betriebssysteme betriebssystem) {
            this.betriebssystem = betriebssystem;
            return this;
        }

        public Computer build() {
            return new Computer(seriennr, hersteller, kernAnzahl, betriebssystem);
        }
    }

    public static void main(String[] args) {
        Computer c = new ComputerBuilder(12345, "DELL")
                .withKernAnzahl(20)
                .withBetriebssystem(Betriebssysteme.LINUX)
                .build();

        c.ausführe(new Programm() {
            @Override
            public void ausfuehren() {
                System.out.println("Hallo Welt");
            }
        });
    }
}
