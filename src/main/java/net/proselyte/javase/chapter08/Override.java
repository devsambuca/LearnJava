package main.java.net.proselyte.javase.chapter08;

/**
 * @author Fominykh Vladimir
 */
public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show("Это к: "); // вызвается метод show() из класса B
        subOb.show(); // вызвается метод show() из класса А
    }



//    } B subOb = new B(1, 2, 3);
//        subOb.show(); // здесь вызывается метод show() из класса B
//    }
}
