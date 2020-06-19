package day01.demo04;

public class Computer {
    public void poweron(){
        System.out.println("打开电脑");
    }

    public void poweroff(){
        System.out.println("关闭电脑");
    }

    public void UseDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse){
            ((Mouse) usb).click();//向下转型
        }else if (usb instanceof keyboard){
            ((keyboard) usb).type();//向下转型
        }
        usb.close();
    }


}
