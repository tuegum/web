package day01.demo03;

import java.util.ArrayList;
import java.util.Random;

public class member extends user{
    public member() {
    }

    public member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list ){
        int index = new Random().nextInt(list.size());
        Integer delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(delta + money);
    }
}
