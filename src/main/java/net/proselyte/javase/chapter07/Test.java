package main.java.net.proselyte.javase.chapter07;

/**
 * @author Fominykh Vladimir
 *
 *  Возврат объекта
 */
public class Test {
    int a;              // доступ, определяемый по умолчанию
    public int b;       // открытый доступ
    private int c;      // закрытый доступ

    // методы доступа к члену с данного класса
    void setc(int i) { // доступ, определяемый по умолчанию
        c = i;
    }
    int getc() {        // получить значение члена с данного класса
        return c;
    }
}


//  4)  Возврат объекта
//public class Test {
//    int a;
//
//    Test(int i){
//        a = i;
//    }
//    Test incrByTen() {
//        Test temp = new Test(a + 10);
//        return temp;
//    }
//}


//  3)  Объекты передаются по ссылке на них
//
//public class Test {
//    int a, b;
//
//    Test(int i, int j) {
//        a = i;
//        b = j;
//    }
//
//    //передать объект
//    void meth(Test o) {
//        o.a *= 2;
//        o.b /= 2;
//    }
//}



//  2)    Аргументы примитивных типов передыются по значению
//    void meth(int i, int j) {
//        i *= 2;
//        j /= 2;
//    }
//}



//  1)    Объекты допускается передавать в качестве параметров
//    int a, b;
//
//    Test(int i, int j){
//        a = i;
//        b = j;
//    }
//    // возвратить логическое значение true, если в качестве
//    // параметра о указан вызывающий объект
//    boolean equals(Test o){
//        if(o.a == a && o.b == b) return true;
//        else return false;
//    }
//}
