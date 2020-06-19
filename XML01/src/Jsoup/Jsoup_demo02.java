package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Jsoup_demo02 {
    public static void main(String[] args) throws IOException {
        String path = Jsoup_demo02.class.getClassLoader().getResource("dtd/student2.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println("========1111111111111=============");
        //1.获取所有stu对象
        Elements elements = document.getElementsByTag("stu");
        System.out.println(elements);
        System.out.println("=========222222222222========");

        //2.获取属性名为id的对象
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("===========333333333=============");

        //3.获取number属性值为s003的元素对象
        Elements elements2 = document.getElementsByAttributeValue("number", "s004");
        System.out.println(elements2);
        System.out.println("==========44444444444===========");

        //4
        Element element = document.getElementById("tuegum");
        System.out.println(element);
    }
}
