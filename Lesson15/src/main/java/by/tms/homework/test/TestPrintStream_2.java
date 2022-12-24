package by.tms.homework.test;

import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream_2 {
    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream("Lesson15/src/main/resources/testPrint")) {
            printStream.print("Hello world ");
            printStream.println("Java");
            printStream.printf("| Name:%20s | Age:%20d |\n", "Tom", 20);
            
            String stringBuffer = "Print Stream";
            byte[] buffer = stringBuffer.getBytes();
            printStream.write(buffer);
            System.out.println("File was written");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("We have written PrintStream file");
    }
}
