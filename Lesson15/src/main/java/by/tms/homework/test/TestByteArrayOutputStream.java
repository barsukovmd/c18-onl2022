package by.tms.homework.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestByteArrayOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String string = "Hello Byte Array";
        byte[] bufferArray = string.getBytes();
        try {
            byteArrayOutputStream.write(bufferArray);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        for (byte b : byteArray) {
            System.out.println((char) b);
        }
        System.out.println();
    }
}
