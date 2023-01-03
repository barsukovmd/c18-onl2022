package by.tms.homework.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIOStream {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("Lesson15/src/main/resources/test");
             FileOutputStream fileOutputStream = new FileOutputStream("Lesson15/src/main/resources/test2")) {
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer, 0, buffer.length);
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("File was read and rewritten");
    }
}
