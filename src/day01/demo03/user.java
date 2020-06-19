package day01.demo03;

public class user {
    private String name; //姓名
    private int money; //余额

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("我叫 " + name + "  余额有 " + money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public user() {
    }

    public user(String name, int money) {
        this.name = name;
        this.money = money;
    }
}
