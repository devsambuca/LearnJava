package main.java.net.proselyte.javase.chapter20;

import java.io.File;

/**
 * @author Fominykh Vladimir
 *         <p>
 *         Продемонстрировать применение некоторых методов из класса File
 */
public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT.txt");
        p("Имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Абсолютный путь: " + f1.getAbsolutePath());
        p("Родительский каталог: " + f1.getParent());
        p(f1.exists() ? "Существует" : "не существует");
        p(f1.canWrite() ? "доступен для записи" : "не доступен для записи");
        p(f1.canRead() ? "доступен для чтения" : "не доступен для чтения");
        p(f1.isDirectory() ? "является каталогом" : "не является каталогом");
        p(f1.isFile() ? "является обычным файлом" : "может быть именованным каналом");
        p(f1.isAbsolute() ? "является абослютным" : "является абослютным");
        p("Последнее изменение в файле: " + f1.lastModified());
        p("Размер: " + f1.length() + " байт");
    }
}
