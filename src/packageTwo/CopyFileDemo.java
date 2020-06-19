package packageTwo;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException{
        File file_read = new File("D:\\software\\Simplicity Studio\\developer\\sdks");
        File file_write = new File("D:\\Desk\\tuegum\\项目\\SS01\\BT_doc\\all");
        long s = System.currentTimeMillis();
        CopyFile(file_read,file_write);
        long e = System.currentTimeMillis();
        System.out.println("拷贝一共使用了：" + (e-s) + "毫秒！");

    }

    private static void CopyFile(File file_read, File file_write) throws IOException {
        if (!file_read.isDirectory()){
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file_read));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file_write));

            int len = 0;
            byte[] bytes = new byte[1024*10];

            while((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
            bis.close();
            bos.close();
        }else{
            //只复制pdf文件，不创建新文件夹
//            file_write.mkdirs();
            File[] listFiles = file_read.listFiles(pathname -> pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("pdf"));
            for (File file : listFiles) {
                File f1 = new File(file_read.getAbsolutePath() + File.separator + file.getName());
                File f2 = new File(file_write.getAbsolutePath() + File.separator + file.getName());
                CopyFile(f1,f2);
            }
        }




    }
}
