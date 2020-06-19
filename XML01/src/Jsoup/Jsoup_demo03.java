package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Jsoup_demo03 {
    public static void main(String[] args) throws IOException {
        String path = Jsoup_demo03.class.getClassLoader().getResource("dtd/student2.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        System.out.println("======通过document对象获取name标签，获取所有的name标签，获取2个========");
        //通过document对象获取name标签，获取所有的name标签，获取2个
        Elements name = document.getElementsByTag("name");
        System.out.println(name.size());

        System.out.println("========通过element对象获取子标签对象=========");
        //通过element对象获取子标签对象
        Element element_stu = document.getElementsByTag("stu").get(0);
        Elements element_name1 = element_stu.getElementsByTag("name");
        System.out.println(element_name1.size());

        System.out.println("==============获取student对象的属性值=============");
        //获取student对象的属性值
        String number = element_stu.attr("number");
        System.out.println(number);

        System.out.println("=======获取文本内容=========");
        //获取文本内容
        String text = element_stu.text();
        String html = element_stu.html();
        System.out.println("=====text====");
        System.out.println(text);
        System.out.println("====html======");
        System.out.println(html);

    }
}
