package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/*选择器查询*/
public class Jsoup_demo04 {
    public static void main(String[] args) throws IOException {
        String path = Jsoup_demo04.class.getClassLoader().getResource("dtd/student2.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        System.out.println("==============查询name标签================");
        //1.查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);

        System.out.println("==============查询id为tuegum的元素================");
        //2.查询id为tuegum的元素
        Elements elements1 = document.select("#tuegum");
        System.out.println(elements1);

        System.out.println("==========获取stu标签并且number属性值为s003的age标签============");
        //3.获取stu标签并且number属性值为s003的age标签
        Elements ele_stu_age = document.select("stu[number=\"s003\"]").select("age");
        System.out.println(ele_stu_age);
        System.out.println("=====分割线======");
        //3.2获取stu标签并且number属性值为s003的age标签
        System.out.println(document.select("stu[number=\"s003\"] > age"));
    }
}
