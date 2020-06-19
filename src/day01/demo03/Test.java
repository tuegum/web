package day01.demo03;

import java.util.ArrayList;

public class Test /*extends Object*/{
    public static final int NUM = 12;
    public static void main(String[] args) {
        manager manager = new manager("群主",100);
        member one = new member("成员A",0);
        member two = new member("成员B",0);
        member three = new member("成员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=================");

        ArrayList<Integer> redList = manager.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
