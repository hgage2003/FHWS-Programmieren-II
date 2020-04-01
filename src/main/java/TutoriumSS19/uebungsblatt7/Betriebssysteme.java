package TutoriumSS19.uebungsblatt7;

public enum Betriebssysteme {
    WINXP(5000),
    WIN10(100),
    LINUX(100);

    public int sleeptime;

    Betriebssysteme(int sleeptime) {
        this.sleeptime = sleeptime;
    }
}
