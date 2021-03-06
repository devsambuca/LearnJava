package main.java.net.proselyte.javase.chapter20;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Fominykh Vladimir
 *         <p>
 *         Просмотреть каталог HTML-файлов
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("class");
        String s[] = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
