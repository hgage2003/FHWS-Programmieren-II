package ueb20.aufgabe1;

public class YingYangThreadRunnable implements Runnable {
    String msg;

    public YingYangThreadRunnable(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        YingYangThreadRunnable ying = new YingYangThreadRunnable("ying");
        YingYangThreadRunnable yang = new YingYangThreadRunnable("yang");

        Thread t1 = new Thread(ying);
        Thread t2 = new Thread(yang);

        t1.start();
        t2.start();
    }
}
