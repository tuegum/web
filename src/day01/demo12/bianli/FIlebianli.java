package day01.demo12.bianli;

import java.io.File;

public class FIlebianli {
    public static void main(String[] args) {
        File file = new File("D:\\资料\\Java学习视频\\1-3Java语言高级");
        getFileName(file);

    }

    private static void getFileName(File dir) {
       /* File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith("txt");
            }
        });*/

       //匿名内部类
        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith("txt");
            }
        });*/

        //lambda表达式
       /* File[] files = dir.listFiles((File pathname)->{
            return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("txt");
        });*/

        //优化lambda表达式
       /* File[] files = dir.listFiles(pathname -> pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("txt"));*/

        //lambda表达式
      /*  File[] files = dir.listFiles((File d, String name)->{
            return new File(d,name).isDirectory() || name.toLowerCase().endsWith("txt");
        });*/

      //优化lambda表达式
      /*  File[] files = dir.listFiles(((dir1, name) ->new File(dir1,name).isDirectory() || name.toLowerCase().endsWith("txt") ));*/
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getFileName(f);
            }else {
                System.out.println(f.getName().toLowerCase());
            }

            /*else {
                String s = f.toString();
                boolean b = s.endsWith("txt");
                if (b) {
                    System.out.println(f);
                }
            }*/
        }
    }
}
