package by.tms.homework.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {
    public static void main(String[] args) {
        String str = "Hello PrintStream";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Lesson15/src/main/resources/test2");
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(str);
            System.out.println("Writing has been done");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
