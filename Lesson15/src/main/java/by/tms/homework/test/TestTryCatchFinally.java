package by.tms.homework.test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestTryCatchFinally {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Lesson15/src/main/resources/test");
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
