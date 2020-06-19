package day01.demo08;

public class demo {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        new Baozipu(baozi).start();
        new Chihuo(baozi).start();
    }
}
