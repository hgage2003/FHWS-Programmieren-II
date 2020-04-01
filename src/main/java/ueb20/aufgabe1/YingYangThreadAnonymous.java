package ueb20.aufgabe1;

public class YingYangThreadAnonymous {

    Thread thread;
    String msg;

    public YingYangThreadAnonymous(String msg, Thread thread) {
        this.msg = msg;
        this.thread = thread;
    }

    public static void main(String[] args) {

        Thread ying = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println("Ying");
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread yang = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println("Yang");
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        ying.start();
        yang.start();
    }
}
