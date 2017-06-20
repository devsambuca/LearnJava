package main.java.net.proselyte.javase.chapter07;

/**
 * @author Fominykh Vladimir
 */
public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // Эти операторы правильны, поэтому члены a и b
        // данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может вызвать ошибку
      //ob.c = 100; // ОШИБКА!

        // Доступ к члену c данного класса должен осуществляться
        // с помощью методов ее класса
        ob.setc(100); // ВЕРНО!
        System.out.println("a, b, и c: " + ob.a + " " + ob.b + " " + ob.getc());


    }
}
