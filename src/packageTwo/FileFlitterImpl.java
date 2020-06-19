package packageTwo;

import java.io.File;
import java.io.FileFilter;

public class FileFlitterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("pdf");
    }
}
