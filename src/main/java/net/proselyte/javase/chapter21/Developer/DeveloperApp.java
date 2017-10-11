package main.java.net.proselyte.javase.chapter21.Developer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {
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




            System.out.println("Developer before: " + developer.toString());
            developer.setSalary(60000);
            System.out.println("After update: " + developer.toString());

        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }
    }
}
