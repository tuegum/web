package day01.demo04;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("连接鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click() {
        System.out.println("点击鼠标");
    }

}
