package main.java.net.proselyte.javase.chapter07;

/**
 * @author Fominykh Vladimir
 */
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
