package day01.demo10;

import java.io.File;
import java.io.FileFilter;

public class  fileFiltterImpl  implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith("txt");
    }
}
