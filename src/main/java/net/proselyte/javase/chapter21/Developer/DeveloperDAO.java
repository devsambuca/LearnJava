package main.java.net.proselyte.javase.chapter21.Developer;

import java.io.*;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO {
    List<Developer> devList = new ArrayList<>();

    public String save() {
        try {
            // find the file with the developer date
            File devFile = new File("test.txt");


            Scanner devScanner = new Scanner(devFile);


            while (devScanner.hasNext()) {
                String nextLine = devScanner.nextLine();
                String[] devData = nextLine.split(",");
                devList.add(new Developer((Long.parseLong(devData[0])), devData[1], devData[2], devData[3], Double.parseDouble(devData[4])));
            }
            for (Developer dev : devList) {
                System.out.println(dev);

            }
            return String.valueOf(devList);

        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }
        return null;
    }


//    public long getById(Long id) {
//        for (Developer dev : devList) {
//            if (id.equals(dev)) {
//
//            }
//        }
//        return Long.parseLong(null);
//    }
}

