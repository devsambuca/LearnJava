package main.java.net.proselyte.javase.chapter21.Developer;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {

        DeveloperDAO d1 = new DeveloperDAO();
        d1.save();
        System.out.println();
        d1.getById(1l);
        System.out.println();
        d1.remove(5l);
        System.out.println();
        d1.remove(2l);
        d1.getById(2l);
        System.out.println();
        d1.update(6l);

    }
}
