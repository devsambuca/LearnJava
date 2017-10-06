package main.java.net.proselyte.javase.chapter20;

import java.io.*;
import java.nio.file.*;

/**
 * @author Fominykh Vladimir
 *
 * Эта программа выводит текстовый файл, используя код
 * потокового ввода-вывода на основе системы NIO.
 *
 * Чтобы воспользоваться этой программой, укажите имя файла,
 * который требуется просмотреть. Например, чтобы просмотреть
 * файл TEST.TXT, введите в режиме командной строки
 * следующую команду:
 *
 * java ShowFile TEST.TXT
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;

        // сначала удостовериться, что указано имя файла
        if (args.length != 1) {
            System.out.println("Применение: ShowFile имя_файла");
            return;
        }

        // открыть файл и получить связанный с ним поток ввода-вывода
        try (InputStream fin = Files.newInputStream(Paths.get(args[0]))) {

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
