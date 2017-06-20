package main.java.net.proselyte.javase.chapter06;

/**
 * @author Fominykh Vladimir
 *
 * В этом классе определяется целочисленный стек, который может
 * хранить 10 значений
 */
public class Stack {
    /* Теперь переменные stck и tos являются закрытыми.
       Это означает, что они не могут быть случайно или
       намеренно изменены таким образом, чтобы нпрушить стек.

     */
    private int stck[] = new int[10];
    private int tos;

    //инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    //разместить элемент в стеке
    void push (int item) {
        if (tos == 9) System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];

    }
}

//    В этом классе определяется целочисленный стек, в котором
//         можно хранить до 10 целочисленных значений

//public class Stack {
//    int stck[] = new int[10];
//    int tos;
//
//    //инициализировать вершину стека
//    Stack() {
//        tos = -1;
//    }
//
//    //разместить элемент в стеке
//    void push (int item) {
//        if (tos == 9) System.out.println("Стек заполнен.");
//        else
//            stck[++tos] = item;
//    }
//
//    // извлечь элемент из стека
//    int pop() {
//        if (tos < 0) {
//            System.out.println("Стек не загружен.");
//            return 0;
//        }
//        else
//            return stck[tos--];
//
//    }
//}
