package main.java.net.proselyte.javase.chapter06;

/**
 * @author Fominylh Vladimir
 *
 * В этом классе объявляется объект типа Box
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
                // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // расчитать объем параллепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
