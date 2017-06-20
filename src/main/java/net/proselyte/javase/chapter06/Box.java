package main.java.net.proselyte.javase.chapter06;

/**
 * @author Fominykh Vladimir
 *
 * В этой версии класса Box один объект допускается
 * инициализировать другим объектом
 */

public class Box {
    double width;
    double height;
    double depth;

    // Обратите винимание на этот конструктор.
    // В качестве параметра в нем используется объект типа Box
    public Box (Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый при указании всех размеров
    public Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, если ни один из размеров не указан
    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

     // конструктор используемый при создании куба
    public Box(double len) {
        width = height = depth = len;
    }

    // расчитать и возвратить объем
    public double volume() {
        return width * height * depth;
    }


//    double width;
//    double height;
//    double depth;
//
//    // конструктор используемый при указании всех размеров
//    public Box(double width, double height, double depth) {
//
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//        }
//
//    // конструктор используемый когда ни один из размеров не указан
//    public Box() {
//        width = -1;
//        height = -1;
//        depth = -1;
//    }
//
//    // // конструктор используемый при создании куба
//    public Box(double len) {
//        width = height = depth = len;
//    }
//
//    // расчитать и возвратить объем
//    public double volume() {
//        return width * height * depth;
//    }

}
/*
    BoxDemo 7
  В данном примере конструкторы определяются в классе Box
  для инициализации размеров параллелепипеда тремя разными способами

 class Box {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
*/

/*
    BoxDemo6

public class Box {

    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и вовратить объем
    double volume() {
        return width * height * depth;
    }
*/
/*
    BoxDemo5

    // вывести объем параллелепипеда
    double volume() {
        return width * height * depth;
    }

    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
    }

*/

