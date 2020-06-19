package day01.demo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class doudizhu {
    public static void main(String[] args) {
        //1、准备牌
        // 定义一个储存54张牌的集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个储存牌的花色，另外一个储存拍的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for(String number : numbers){
            for(String color : colors){
                poker.add(color + number);
            }
        }
        //2.洗牌
        //
        Collections.shuffle(poker);
        /*System.out.println(poker);*/

        //3.发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i > 50){
                left.add(p);
            }else if (i % 3 == 0){
                player01.add(p);
            }else if (i % 3 == 1){
                player02.add(p);
            }else if (i % 3 == 2){
                player03.add(p);
            }
        }
        //看牌
        System.out.println("玩家1：" + player01);
        System.out.println("玩家2：" + player02);
        System.out.println("玩家3：" + player03);
        System.out.println("底牌：" + left);

        //理牌

    }
}
