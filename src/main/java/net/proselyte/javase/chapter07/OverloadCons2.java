package main.java.net.proselyte.javase.chapter07;

import main.java.net.proselyte.javase.chapter06.Box;

/**
 * @author Fominykh Vladimir
 */
public class OverloadCons2 {
    public static void main(String[] args) {
//        создать параллелепипеды, используя
//        разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);

//        создать копию объекта mybox1
        double vol;

//        получить объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

//        получить объем второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

//        получить объем куба
        vol = mycube.volume();
        System.out.println("Объем равен " + vol);

//        получить объем клона
        vol = myclone.volume();
        System.out.println("Объем равен " + vol);



    }
}
