package main.java.net.proselyte.javase.chapter07;

/**
 * @author Fominykh Vladimir
 *
 * Объекты допускается передавать в качестве параметров
 */
public class Test {
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    // возвратить логическое значение true, если в качестве
    // параметра о указан вызывающий объект
    boolean equals(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
