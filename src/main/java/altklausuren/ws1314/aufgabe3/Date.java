package altklausuren.ws1314.aufgabe3;

import java.util.Arrays;

public class Date implements Comparable<Date> {
    private int day, month, year;

    Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }

    public int compareTo(Date d) {

        int d1 = (this.year * 10000) + (this.month * 100) + this.day;
        int d2 = (d.year * 10000) + (d.month * 100) + d.day;

        if (d1 < d2) {
            return -1;
        } else if (d1 == d2) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Date[] dates = new Date[]{
                new Date(31, 12, 2014),
                new Date(15, 3, -44),
                new Date(9, 11, 1989),
                new Date(3, 10, 1990)
        };
        Arrays.sort(dates);

        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i].toString());
        }
    }
} 

