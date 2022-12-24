package by.tms.homework.test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStreamByte {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("Lesson15/src/main/resources/test")) {
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer, 0, fileInputStream.available());
            //почему здесь высвечивается ignored? если все правильно читается
            for (byte b : buffer) {
                System.out.println((char) b);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("File has been ridden");
    }
}
