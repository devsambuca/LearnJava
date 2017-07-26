package main.java.net.proselyte.javase.chapter18;
import java.util.*;
/**
 * @author Fominykh Vladimir
 */
public class MailList {
    public static void main(String[] args) {
        LinkedList <Address> ml = new LinkedList<Address>();

        //ввести элементы в связной список
        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Marle Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        //вывести список почтовых адресов
        for (Address element : ml)
            System.out.println(element + "\n");

        System.out.println();
    }
}

