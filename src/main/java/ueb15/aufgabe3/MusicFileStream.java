package ueb15.aufgabe3;

import java.io.*;
import java.util.Scanner;

public class MusicFileStream {

    public static void copy(InputStream is, OutputStream os) throws IOException {
        byte[] b = new byte[1024];
        int n;

        do {
            n = is.read(b);
            if (n != -1) os.write(b);
        } while (n != -1);
    }

    public static boolean copyMusicFileUnbuffered(String path) {
        try (InputStream is = new FileInputStream(path);
             OutputStream os = new FileOutputStream(path + ".copied")) {
            copy(is, os);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    public static boolean copyMusicFileBuffered(String path) {
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(path));
             BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(path + ".copied"))) {
            copy(is, os);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String path;
        long startTime;
        long endTime;
        long durationUnbuffered;
        long durationBuffered;

        do {
            System.out.println("Bitte Pfad eingeben: ");
            path = s.nextLine();

            startTime = System.currentTimeMillis();
            copyMusicFileUnbuffered(path);
            endTime = System.currentTimeMillis();
            durationUnbuffered = endTime - startTime;
            System.out.println("Unbuffered: " + durationUnbuffered + " Nanosekunden");


            startTime = System.currentTimeMillis();
            copyMusicFileBuffered(path);
            endTime = System.currentTimeMillis();
            durationBuffered = endTime - startTime;
            System.out.println("Buffered: " + durationBuffered + " Nanosekunden");

        } while (!copyMusicFileUnbuffered(path));

        double faktor = (double) (durationUnbuffered / durationBuffered);
        System.out.println("Unterschied: Faktor " + faktor);
        s.close();
    }
}
