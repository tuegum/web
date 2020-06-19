package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Jsoup_demo01 {
    public static void main(String[] args) throws IOException {
        String path = Jsoup_demo01.class.getClassLoader().getResource("dtd/student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elements = document.getElementsByTag("name");
//        System.out.println(elements.size());
//        System.out.println(elements);
        Element element = elements.get(0);
        String name = element.text();
        System.out.println(name);

        System.out.println("==============华丽的分割线================");

        URL url = new URL("https://www.baidu.com");
        Document document1 = Jsoup.parse(url, 10000);
        System.out.println(document1);
    }
}
