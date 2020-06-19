package day01.demo05;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//多肽，左接口右是实现类
        List<String> res = addName(list);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    public static List<String> addName(List<String> list){
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        return list;
    }
}
