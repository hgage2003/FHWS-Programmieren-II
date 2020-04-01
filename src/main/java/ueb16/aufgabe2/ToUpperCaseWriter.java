package ueb16.aufgabe2;

import java.io.*;

public class ToUpperCaseWriter extends Writer {
    Writer writer;

    public ToUpperCaseWriter(Writer writer) {

        this.writer = writer;
    }

    public void write(char c) throws IOException {
        writer.write(Character.toUpperCase(c));
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++)
            write(cbuf[i]);
    }

    public void write(String str, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++)
            write(str.charAt(i));
    }

    public void flush() throws IOException {
        writer.flush();
    }

    public void close() throws IOException {
        writer.close();
    }
}
