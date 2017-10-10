package main.java.net.proselyte.javase.chapter21.Developer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Fominykh Vladimir
 */
public class FileWorker {

    private static StringTokenizer strToken;
    private static String line;
    private static InputStreamReader inReader;
    private static BufferedReader reader;
    private static FileInputStream inFile;

    public static void main(String[] args) throws IOException {

        initFile();
        getData();



        LineNumberReader reader = new LineNumberReader(new FileReader("test.txt"));
        String line = null;
        List<String> list = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {


            StringTokenizer stk = new StringTokenizer(line, ",");
            String[] ar = new String[stk.countTokens()];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = stk.nextToken();
                System.out.print(ar[i]);
            }
        }
    }

    public static void initFile() throws IOException {
        inFile = new FileInputStream("test.txt");
        inReader = new InputStreamReader(inFile);
        reader = new BufferedReader(inReader);
    }

public static void getData() throws IOException {

            line = reader.readLine();

        System.out.println(line);
            System.out.println();

            strToken = new StringTokenizer(line);

            Developer d1 = new Developer();
    long id = Long.parseLong(strToken.nextToken());
    d1.setId(id);


        }


//
//
//




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

