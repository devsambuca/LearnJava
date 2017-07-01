package main.java.net.proselyte.javase.chapter09;

/**
 * @author Fominykh Vladimir
 */

//Реализация "наращиваемого" стека
class DynStack implements IntStack {
    private int stck[];
    private int tos;

    // выделить память и инициировать стек
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        //если стек заполнен, выделить память под стек большого размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // удвоить размер стека
            for (int i = 0; i < stck.length; i ++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }

}
