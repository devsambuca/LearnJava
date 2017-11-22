package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.Callable;

/**
 * Created by smb on 22.11.2017.
 */
public class Hypot implements Callable<Double> {
    double side1, side2;

    Hypot(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }
    public Double call() {
        return Math.sqrt((side1*side2) + (side2*side2));
    }
}
