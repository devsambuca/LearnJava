package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.Callable;

/**
 * Created by smb on 22.11.2017.
 */
public class Factorial implements Callable<Integer> {
    int stop;

    Factorial(int v) {
        stop = v;
    }

    public Integer call() {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}
