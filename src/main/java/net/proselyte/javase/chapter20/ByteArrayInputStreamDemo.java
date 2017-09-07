package main.java.net.proselyte.javase.chapter20;
import java.io.*;
/**
 * @author Fominykh Vladimir
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String tmp = "abcdefghijklmnopqestuvwxyz";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);
        System.out.println(input1.available());
        System.out.println(input2.available());
    }
}
