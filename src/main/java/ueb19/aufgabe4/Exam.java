package ueb19.aufgabe4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exam implements IReadQuestion, IToTest {

    List<Question> questions;

    private Exam() {
        questions = new ArrayList<>();
    }

    public IReadQuestion create() {
        return new Exam();
    }

    public String readHeaderFromFile() {
        return "I am the Tex Header";
    }

    public static Question toQuestion(String line) {
        return new Question(line);
    }

    @Override
    public Exam readQuestion() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\ueb19\\aufgabe4\\questions.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                questions.add(toQuestion(line));
            }
        }
        return this;
    }

    @Override
    public void toTest() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\java\\ueb19\\aufgabe4\\test.tex"))) {
            bw.write(readHeaderFromFile());
            bw.newLine();
            bw.flush();

            for (Question q : questions) {
                bw.write("\\textbf{" + q.toString() + "}\\");
                bw.newLine();
                bw.flush();
            }
            bw.write("\\end{document}");
            bw.flush();
        }
    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        try {
            exam
                    .create()
                    .readQuestion()
                    .toTest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
