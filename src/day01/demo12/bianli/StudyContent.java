package day01.demo12.bianli;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StudyContent {
    public Set<String> macSet = Collections.synchronizedSet(new HashSet<String>());//保证线程同步
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\资料\\Java学习视频\\1-3Java语言高级");
        File file2 = new File("D:\\资料\\Java学习视频\\1-3Java语言高级\\study_content.txt");

        List<String> list_mulu = new ArrayList<>();
        List<String> list_content = new ArrayList<>();

        getStudyContent(file,list_mulu,list_content);

        FileOutputStream fos = new FileOutputStream(file2);
        for (String s : list_mulu) {
            fos.write(s.getBytes());
            fos.write("\r\n".getBytes());
            for (String s1 : list_content) {
                fos.write(s1.getBytes());
                fos.write("\r\n".getBytes());
            }
        }
    }

    private static void getStudyContent(File dir ,List<String> list_mulu,List<String> list_content) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getStudyContent(f,list_mulu,list_content);
                list_mulu.add(f.getName().toLowerCase());
            }else {
                list_content.add(f.getName().toLowerCase());
            }
        }

    }
}
