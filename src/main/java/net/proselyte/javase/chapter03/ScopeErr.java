package main.java.net.proselyte.javase.chapter03;

/**
 * Created by smb on 12.06.2017.
 */
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {                   //Создается новая область действия
          //  int bar = 2;    // Ошибка во время компиляции - переменная bar уже определена!
        }
    }
}
