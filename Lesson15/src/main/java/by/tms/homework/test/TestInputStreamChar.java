package by.tms.homework.test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStreamChar {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("Lesson15/src/main/resources/test")) {
            System.out.println(fileInputStream.available());
            int i;
            while ((i = fileInputStream.read()) != 1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
