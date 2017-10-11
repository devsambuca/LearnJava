package main.java.net.proselyte.javase.chapter21.Developer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO {

    public static void getData() {
        try {
            // find the file with the developer date
            File devFile = new File("test.txt");

            Scanner devScanner = new Scanner(devFile);

            String nextLine = devScanner.nextLine();

            String[] devData = nextLine.split(",");

            String strId = devData[0];
            String strFirstName = devData[1];
            String strLastName = devData[2];
            String strPosition = devData[3];
            String strSalary = devData[4];

            Developer developer = new Developer();
            long lgId = Long.parseLong(strId);
            developer.setId(lgId);

            double dbSalary = Double.parseDouble(strSalary);
            developer.setSalary(dbSalary);
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }
    }

//    public static String[] divide(String s) {
//        ArrayList<String> tmp = new ArrayList<String>();
//        int i = 0;
//        boolean f = false;
//
//        for (int j = 0; j < s.length(); j++) {
//            if (s.charAt(j) == ' ') {
//                if (j > i) {
//                    tmp.add(s.substring(i, j));
//                }
//                i = j + 1;
//            }
//        }
//        if (i < s.length()) {
//            tmp.add(s.substring(i));
//        }
//        return tmp.toArray(new String[tmp.size()]);
//    }

//
//    private static StringTokenizer strToken;
//    private static String line;
//    private static InputStreamReader inReader;
//    private static BufferedReader reader;
//    private static FileInputStream inFile;

//        String s = "   1  aaa  2 bbbbbb 3    cccc  4 5 6     7     x";
//        String[] r = divide(s);
//        for (int i = 0; i < r.length; i++)
//            System.out.println('"' + r[i] + '"');
//
//    Developer d1 = new Developer();
//
//        initFile();
//        getData();
//
//        LineNumberReader reader = new LineNumberReader(new FileReader("test.txt"));
//        String line = null;
//        List<String> list = new ArrayList<String>();
//        while ((line = reader.readLine()) != null) {


//        StringTokenizer stk = new StringTokenizer(line, ",");
//        String[] ar = new String[stk.countTokens()];
//        for (int i = 0; i < ar.length; i++) {
//            ar[i] = stk.nextToken();
//
//
//        }
//    }
//    }
//
//    public static void initFile() throws IOException {
//        inFile = new FileInputStream("test.txt");
//        inReader = new InputStreamReader(inFile);
//        reader = new BufferedReader(inReader);
//    }

//    public static void getData() {
//        try {
//
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//                String[] list = line.split(",");
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage() + " Error reading file");
//        } finally {
//            System.exit(0);
//            strToken = new StringTokenizer(line);
//        }
//    }
//}


// long id = Long.parseLong(strToken.nextToken());


//
//
//


//        Developer d2 = new Developer();
//     d1.setName("Ivan");
//
//    System.out.println(d1.getName());
//      System.out.println(d2.getId());
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
