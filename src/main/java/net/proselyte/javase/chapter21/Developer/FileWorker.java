package main.java.net.proselyte.javase.chapter21.Developer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fominykh Vladimir
 */
public class FileWorker {
    public static void main(String[] args) throws IOException {

        LineNumberReader reader = new LineNumberReader(new FileReader("test.txt"));
        String line = null;
        List<String> list = new ArrayList<String>();
        while ((line = reader.readLine()) !=null) {
            list.add(line);
        }

        System.out.println(list);
//
//
//


    }
}
////        Developer d2 = new Developer();
////        d1.setName("Ivan");
////
////        System.out.println(d1.getName());
////        System.out.println(d2.getId());
//
//        String filePath = "test.txt";
//        String appendText = "\n Этой строкой мы будем обновлять существующий файл";
//
//        update(filePath,appendText);
//    }
//
//
//    public static void read() {
//        int data;
//        try (InputStream inputStream = Files.newInputStream(Paths.get("test.txt"))) {
//            do {
//                data = inputStream.read();
//
//                if (data != -1) {
//                    System.out.print((char) data);
//                }
//            } while (data != -1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void update(String fileName, String newText) {
//        try (OutputStream data = new FileOutputStream(new File(fileName), true)) {
//            data.write(newText.getBytes(), 0, newText.length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//
//
//
////        try {
////            RandomAccessFile aFile = new RandomAccessFile(
////                    "test.txt", "r");
////            FileChannel inChannel = aFile.getChannel();
////            long fileSize = inChannel.size();
////            ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);
////            inChannel.read(buffer);
////            //buffer.rewind();
////            buffer.flip();
////            for (int i = 0; i < fileSize; i++) {
////                System.out.print((char) buffer.get());
////            }
////            inChannel.close();
////            aFile.close();
////        } catch (IOException exc) {
////            System.out.println(exc);
////            System.exit(1);
////        }
//

