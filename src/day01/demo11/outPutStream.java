package day01.demo11;

import java.io.FileOutputStream;
import java.io.IOException;

public class outPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\TTTTT\\QQ\\fos.txt");
        fos.write(97);
        fos.close();
    }
}
