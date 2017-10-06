package main.java.net.proselyte.javase.chapter20;
import java.io.*;
/**
 * @author Fominykh Vladimir
 */
public class FindDir {
    public static void main(String[] args) {
        String file = "D://java/LearnJava";
        String find = "test.txt";


        File myFile = new File(file);
        String [] list = myFile.list();
        for (String f : list)
           if (f.equals(find))

        System.out.println(f);
    }
}

