package by.tms.homework.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutPutStream {
    public static void main(String[] args) {
        String string = "Hello, new file for writing";
        try (FileOutputStream fileOutputStream = new FileOutputStream("/Users/yauhenbarsukov/IdeaProjects/c18-onl2022/Lesson15/src/main/resources/test")) {
            byte[] buffer = string.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("We have successfully written our file");
    }
}
