package main.java.net.proselyte.javase.chapter20;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Fominykh Vladimir
 */
public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
