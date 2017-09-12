package main.java.net.proselyte.javase.chapter20;

import java.io.Serializable;

/**
 * @author Fominykh Vladimir
 */
public class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.d = d;
        this.i = i;
    }

    public String toString() {
        return "s=" + s + "; i =" + i + "; d = " + d;
    }
}
