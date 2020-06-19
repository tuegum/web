package day01.demo11;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStream_02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\TTTTT\\QQ\\b.txt");
        fos.write("dsad你好#￥%……".getBytes());
        fos.close();
    }
}
