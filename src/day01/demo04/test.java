package day01.demo04;

public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.poweron();

       /* //多态方法 父类引用指向子类对象
        USB usbMouse = new Mouse();
        computer.UseDevice(usbMouse);

        //无多态方法，类似强制类型转换，向上转
        keyboard usbKeyboard = new keyboard();
        computer.UseDevice(usbKeyboard);*/

       //通过子类对象，匿名对象
        computer.UseDevice(new Mouse());
        computer.UseDevice(new keyboard());

        computer.poweroff();
    }
}
