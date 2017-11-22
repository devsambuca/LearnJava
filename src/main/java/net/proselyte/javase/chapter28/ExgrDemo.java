package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.Exchanger;

/**
 * Пример применение класса Exchanger
 *
 * Created by smb on 22.11.2017.
 */
public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<String>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}
