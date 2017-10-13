package main.java.net.proselyte.javase.chapter21.Developer;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {

        DeveloperDAO d1 = new DeveloperDAO();
        d1.save();
        d1.getById(1l);
        d1.remove(5l);
        d1.update(2l);


    }
}
