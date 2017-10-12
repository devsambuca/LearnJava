package main.java.net.proselyte.javase.chapter21.Developer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {

            DeveloperDAO d1 = new DeveloperDAO();
            Developer dev1 = new Developer(1,"","","",1);
            d1.save();
        System.out.println(d1.devList.get(0));

    }
}
