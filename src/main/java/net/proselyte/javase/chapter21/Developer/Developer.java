package main.java.net.proselyte.javase.chapter21.Developer;

/**
 * @author Fominykh Vladimir
 */
public class Developer {

    private long id;
    private String name;
    private String surname;
    private String job;
    private double total;
    private String asString = null;



     public Developer (long id, String name, String surname, String job, double total) {
         this.id = id;
         this.name = name;
         this.surname = surname;
         this.job = job;
         this.total = total;
    }

    @Override
    public String toString() {
        if (asString == null) {
            asString = id + "," + surname + "," + job + "," + total;

        }
        return asString;
    }

    public Developer() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }



}
