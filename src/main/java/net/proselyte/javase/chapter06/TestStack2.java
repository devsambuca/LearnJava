package main.java.net.proselyte.javase.chapter06;

import main.java.net.proselyte.javase.chapter06.Stack;

/**
 * @author Fominykh Vladimir
 */
public class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        // разместить числа в стеке
        for (int  i = 0; i < 5; i++) mystack1.push(i);
        for (int  i = 0; i < 8; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());


    }
}
