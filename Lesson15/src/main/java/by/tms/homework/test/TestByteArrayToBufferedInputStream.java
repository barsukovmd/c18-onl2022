package by.tms.homework.test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TestByteArrayToBufferedInputStream {
    public static void main(String[] args) {
        String s = "Hello";
        byte[] buffer = s.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
            int c;
            while ((c = bufferedInputStream.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
