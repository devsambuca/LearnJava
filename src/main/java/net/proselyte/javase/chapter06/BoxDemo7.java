package main.java.net.proselyte.javase.chapter06;

/**
 * @author Fominykh Vladimir
 */
public class BoxDemo7 {
    public static void main(String[] args) {
        //объявить, выделить память и инициализировать объекты типа Box
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3,6,9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

    }
}
