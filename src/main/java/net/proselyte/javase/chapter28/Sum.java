package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.Callable;

/**
 * Created by smb on 22.11.2017.
 */
public class Sum implements Callable<Integer> {
    int stop;

    Sum (int v) {
        stop = v;
    }
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}
