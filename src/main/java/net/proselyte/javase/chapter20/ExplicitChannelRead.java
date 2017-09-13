package main.java.net.proselyte.javase.chapter20;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

/**
 * @author Fominykh Vladimir
 *
 * Использовать канал ввода-вывода для чтения файла
 */
public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        // сначала получить путь к файлу
        try {
            filepath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
            return;
        }

        // затем получить канал к этому файлу в
        // блоке оператора try с ресурсами
        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {

            // выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                // читать данные из файла в буфер
                count = fChan.read(mBuf);

                // прекратить чтение по достижению конца файла
                if (count != -1) {

                    // подготовить буфер к чтению из него данныз
                    mBuf.rewind();

                    // читать байты данных из буфера
                    // выводить из на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);

            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
// (2) Более компактный способ открытия канала


//public class ExplicitChannelRead {
//    public static void main(String[] args) {
//        int count;
//        Path filepath = null;
//
//        // Здесь канал открывается по пути, возвращаемому
//        // методом Paths.get() в виде объекта типа Path.
//        // Переменная filepath больше не нужна
//
//        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("text.txt"))) {
//
//            // выделить память под буфер
//            ByteBuffer mBuf = ByteBuffer.allocate(128);
//
//            do {
//                // читать данные из файла в буфер
//                count = fChan.read(mBuf);
//
//                // прекратить чтение по достижению конца файла
//                if (count != -1) {
//
//                    // подготовить буфер к чтению из него данныз
//                    mBuf.rewind();
//
//                    // читать байты данных из буфера
//                    // выводить из на экран как символы
//                    for (int i = 0; i < count; i++) {
//                        System.out.print((char) mBuf.get());
//                    }
//                }
//            } while (count != -1);
//
//            System.out.println();
//        } catch (InvalidPathException e) {
//            System.out.println("ОШибка указания пути " + e);
//        } catch (IOException e) {
//            System.out.println("Ошибка ввода-вывода " + e);
//        }
//    }
//}