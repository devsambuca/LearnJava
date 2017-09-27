package main.java.net.proselyte.javase.chapter20;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
/**
 * @author Fominykh Vladimir
 *
 * Скопировать файл средствами системы ввода-вывода NIO
 */
public class NIOCopy {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Применение: откуда и куда копировать");
            return;
        }
        try {
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);

            // Скопировать файл
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
