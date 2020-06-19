package day01.demo04;

public class keyboard implements USB {
    @Override
    public void open() {
        System.out.println("连接键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("敲键盘");
    }
}
