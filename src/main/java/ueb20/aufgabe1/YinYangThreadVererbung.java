package ueb20.aufgabe1;

public class YinYangThreadVererbung extends Thread {
    private String msg;

    public YinYangThreadVererbung(String msg) {
        this.msg = msg;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(msg + " ");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        YinYangThreadVererbung yin = new YinYangThreadVererbung("Yin");
        YinYangThreadVererbung yang = new YinYangThreadVererbung("Yang");

        yin.start();
        yang.start();
    }
}
