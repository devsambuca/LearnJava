package main.java.net.proselyte.javase.chapter07;

/**
 * @author Fominykh Vladimir
 */
public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10,20);

        ob.test(i); // Здесь вызывается вариант метода test(double)
        ob.test(123.2); // а здесь вызывается вариант метода test(double)
    }


//    public static void main(String[] args) {
//        OverloadDemo ob = new OverloadDemo();
//        double result;
//
//        // вызывать все варианты метода test()
//        ob.test();
//        ob.test(10);
//        ob.test(10, 20);
//        result = ob.test(123.25);
//        System.out.println("Результат вызова ob.test(123.25): " + result);
//    }
}
