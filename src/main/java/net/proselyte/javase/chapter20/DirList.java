package main.java.net.proselyte.javase.chapter20;

import java.io.File;

/**
 * @author Fominykh Vladimir
 *         <p>
 *         Использовать каталоги
 */
public class DirList {

    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог  " + dirname);
            String s [] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if(f.isDirectory()) {
                    System.out.println(s[i] + " является каталогом");
                } else {
                    System.out.println(s[i] + " является файлом");
                }
            }
        } else {
            System.out.println(dirname + " не является каталогом");
        }

    }
}
