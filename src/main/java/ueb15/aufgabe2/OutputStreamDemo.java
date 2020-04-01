package ueb15.aufgabe2;

import java.io.*;

public class OutputStreamDemo {

    public void write(byte[] b, int off, int len) throws IOException {
        if (b == null) throw new NullPointerException();
        if (off < 0 || len < 0 || (off + len) > b.length) throw new IndexOutOfBoundsException();
        //damit sind tatsächlich alle Fehlerfälle abgedeckt

        OutputStream os = new FileOutputStream("test.txt");
        os.write(b, off, len);
        os.close();
    }
}
