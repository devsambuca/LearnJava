package main.java.net.proselyte.javase.chapter07;

import main.java.net.proselyte.javase.chapter06.Box;

/**
 * @author Fominykh Vladimir
 */
public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //получить объем втрого параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем куба
        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
    }
}
