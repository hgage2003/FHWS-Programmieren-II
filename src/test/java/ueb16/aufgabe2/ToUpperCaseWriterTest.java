package ueb16.aufgabe2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ToUpperCaseWriterTest {

    //Using JUnit 5

    ToUpperCaseWriter writer;
    ByteArrayOutputStream baos;

    @BeforeEach
    public void prepareTest() {
        baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        writer = new ToUpperCaseWriter(osw);
    }

    @AfterEach
    public void cleanUp() {
        try {
            writer.close();
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    @ParameterizedTest(name = "{index}: {0} toUpperCase = {1}")
    @MethodSource("data") //Parameter source is 'data' collection
    public void writeCharTest(char input, char expected) {
        try {
            writer.write(input);
            writer.flush();
            String uppercase = baos.toString();
            assertEquals(Character.toString(expected), uppercase); //convert expected to string

        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    //Ascii table as collection with expected value after using ToUpperCaseWriter
    public static Collection<Character[]> data() {
        Character[][] ascii = new Character[128][2];

        for(int row = 0; row < ascii.length; row++) { //128 iterations
            ascii[row][0] = (char) row; //input value
            ascii[row][1] = Character.toUpperCase((char) row); //expected value
        }
        return Arrays.asList(ascii);
    }

}
