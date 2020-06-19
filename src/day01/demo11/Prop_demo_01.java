package day01.demo11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Prop_demo_01 {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("张三","value_01");
        prop.setProperty("李四","value_02");
        prop.setProperty("王五","value_03");
       prop.store(new FileWriter("C:\\Users\\xu.zheng2\\IdeaProjects\\TestOne\\src\\day01\\demo11\\111.txt",true),"save_data");
       Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s + "=" + prop.getProperty(s));
        }


    }
}
