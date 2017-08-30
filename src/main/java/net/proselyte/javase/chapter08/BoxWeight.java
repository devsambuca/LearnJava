package main.java.net.proselyte.javase.chapter08;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

/**
 * @author Fominykh Vladimir
 */
public class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight(BoxWeight ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // инициализировать поля width, height, depth
    // С помощью метода super()
  BoxWeight(double w, double h, double d, double m) {
        super(w, h ,d); // вызвать конструктор суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    // констуктор, применяемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }


//  1)  double weigth; // вес параллелепипеда
//
//    // конструктор, BoxWeigth()
//    BoxWeight (double w, double h, double d, double m) {
//        width = w;
//        height = h;
//        depth = d;
//        weigth = m;
//    }
}
