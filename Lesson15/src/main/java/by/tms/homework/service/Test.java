package by.tms.homework.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "Hello, trying to write Fileoutputstream";
        try (FileOutputStream fos = new FileOutputStream("/Users/yauhenbarsukov/IdeaProjects/c18-onl2022/Lesson15/src/main/resources")) {
            byte[] buffer = str.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The file has been written");
//        try (FileInputStream fileInputStream = new FileInputStream("/Users/yauhenbarsukov/IdeaProjects/c18-onl2022/Lesson15/src/main/resources")) {
//            System.out.println(fileInputStream);
//            int i;
//            while ((i = fileInputStream.read()) != -1) {
//                System.out.println((char) i);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
