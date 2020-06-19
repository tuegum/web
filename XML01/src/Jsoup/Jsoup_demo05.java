package Jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*XPath查询*/
public class Jsoup_demo05 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = Jsoup_demo05.class.getClassLoader().getResource("dtd/student2.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        //根据document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        //结合XPath语法查询
        //1.查询所有的stu标签
        System.out.println("=======1.查询所有的stu标签========");
        List<JXNode> jxNodes = jxDocument.selN("//stu");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }

        System.out.println("=======2.查询所有stu标签下的name标签=======");
        //2.查询所有stu标签下的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//stu/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }

        System.out.println("=======3.查询所有stu标签下带id属性的name标签=======");
        //3.查询所有stu标签下带id属性的name标签
        List<JXNode> jxNodes3 = jxDocument.selN("//stu/name[@id]");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }

        System.out.println("=======4.查询所有stu标签下id属性值为万振宇的name标签=======");
        //4.查询所有stu标签下带id属性的name标签
        List<JXNode> jxNodes4 = jxDocument.selN("//stu/name[@id='万振宇']");
        for (JXNode jxNode : jxNodes4) {
            System.out.println(jxNode);
        }
    }
}
