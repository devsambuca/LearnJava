package main.java.net.proselyte.javase.chapter21.Developer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static main.java.net.proselyte.javase.chapter21.Developer.DeveloperDAO.getData;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {
            getData(Developer );

            System.out.println("Developer before: " + developer.toString());
            System.out.println("After update: " + developer.toString());


    }
}
