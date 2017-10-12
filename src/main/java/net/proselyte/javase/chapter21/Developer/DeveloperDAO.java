package main.java.net.proselyte.javase.chapter21.Developer;

import java.io.*;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO {
    List<Developer> devList = new ArrayList<Developer>();

    public Collection save() {
        try {
            // find the file with the developer date
            File devFile = new File("test.txt");


            Scanner devScanner = new Scanner(devFile);


            while (devScanner.hasNext()) {
                String nextLine = devScanner.nextLine();
                String[] devData = nextLine.split(",");
                devList.add(new Developer((Long.parseLong(devData[0])), devData[1], devData[2], devData[3], Double.parseDouble(devData[4])));
            }
            for (Developer dev : devList) {
                System.out.println(dev);

            }
            return devList;

        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }


        return null;
    }



    private int getIndex(int id) {
        return getIndex(id);
    }

    public Long getById(Long id, List<Developer> devList) {
        if (null != id && null != devList) {
            for (Developer dev : devList) {
                if (getIndex(dev.equals(id)) {
                    return getIndex(id)
                }
            }
        }
        return null;
    }

}








//                    @Override
//                    public int size () {
//                        return 0;
//                    }
//
//                    @Override
//                    public boolean isEmpty () {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean contains (Object o){
//                        return false;
//                    }
//
//                    @Override
//                    public Iterator<Developer> iterator () {
//                        return null;
//                    }
//
//                    @Override
//                    public Object[] toArray () {
//                        return new Object[0];
//                    }
//
//                    @Override
//                    public <T> T[] toArray (T[]a){
//                        return null;
//                    }
//
//                    @Override
//                    public boolean add (Developer developer){
//                        return false;
//                    }
//
//                    @Override
//                    public boolean remove (Object o){
//                        return false;
//                    }
//
//                    @Override
//                    public boolean containsAll (Collection < ? > c){
//                        return false;
//                    }
//
//                    @Override
//                    public boolean addAll (Collection < ? extends Developer > c){
//                        return false;
//                    }
//
//                    @Override
//                    public boolean addAll ( int index, Collection<? extends Developer > c){
//                        return false;
//                    }
//
//                    @Override
//                    public boolean removeAll (Collection < ? > c){
//                        return false;
//                    }
//
//                    @Override
//                    public boolean retainAll (Collection < ? > c){
//                        return false;
//                    }
//
//                    @Override
//                    public void clear () {
//
//                    }
//

//

//
//                    @Override
//                    public void add ( int index, Developer element){
//
//                    }
//
//                    @Override
//                    public Developer remove ( int index){
//                        return null;
//                    }
//
//                    @Override
//                    public int indexOf (Object o){
//                        return 0;
//                    }
//
//                    @Override
//                    public int lastIndexOf (Object o){
//                        return 0;
//                    }
//
//                    @Override
//                    public ListIterator<Developer> listIterator () {
//                        return null;
//                    }
//
//                    @Override
//                    public ListIterator<Developer> listIterator ( int index){
//                        return null;
//                    }
//
//                    @Override
//                    public List<Developer> subList ( int fromIndex, int toIndex){
//                        return null;
//                    }





