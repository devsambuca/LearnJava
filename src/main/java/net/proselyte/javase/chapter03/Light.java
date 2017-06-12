package main.java.net.proselyte.javase.chapter03;

/**
 * @author Fominykh Vladimir
 *
 * Вычислить расстояние, проходимое светом, используя переменные типа long
 */
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000; // указатель количества дней

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds; //вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
