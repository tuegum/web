package day01.demo03;

import java.util.ArrayList;

public class manager extends user{

    public manager(){

    }

    public manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney,int count){
        //首先需要一个集合，用来储存若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //看群主还剩下多少钱
        int leftMoney = super.getMoney();
        if (leftMoney < totalmoney){
            System.out.println("余额不足！！！");
            return redList;
        }
        //扣钱
        super.setMoney(leftMoney - totalmoney);
        //发红包拆成count份
        int avg = totalmoney / count;
        int mod = totalmoney % count;
        //除不开的零头放入最后一个红包，把红包一个一个放入集合当中去
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
