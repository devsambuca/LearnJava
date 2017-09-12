package main.java.net.proselyte.javase.chapter20;



import java.io.*;
/**
 * @author Fominykh Vladimir
 *
 * Продемонстрировать применение сериализации и десериализации
 * В этой программе используется оператор try c ресурсами
 * Требуется установка комплекта JDK, начиная с версии 7
 */
public class SerializationDemo {
    public static void main(String[] args) {
        // произвести серилизацию объекта

        try (ObjectOutputStream objOStrim = new ObjectOutputStream(new FileOutputStream("serial"))) {

            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrim.writeObject(object1);
        }
        catch (IOException e) {
            System.out.println("Исключение при серилизации: " + e);
        }

        // провести десерилизацию объекта
        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass)objIStrm.readObject();
            System.out.println("object2: " + object2);
        }
        catch (Exception e) {
            System.out.println("Исключение при десерилизации: " + e);
            System.exit(0);
        }
    }
}
