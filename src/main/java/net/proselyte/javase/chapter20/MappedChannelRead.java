package main.java.net.proselyte.javase.chapter20;


import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

/**
 * @author Fominykh Vladimir
 */
public class MappedChannelRead {
    public static void main(String[] args) {

        // получить канал к файлу в блоке оператора try с ресурсами
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {

            // получить размер файла
            long fSize = fChan.size();

            // а теперь сопоставить файл с буфером
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            // читать байты из буфера и выводить их на экран
            for (int i = 0; i < fSize; i++)
                System.out.print((char)mBuf.get());

            System.out.println();

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("ОШибка ввода-вывода " + e);

        }
    }
}
