package day01.demo08;

public class Chihuo extends Thread{
    private Baozi baozi;

    public Chihuo(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (baozi.flag == false){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃：" + baozi.pi + baozi.xian + "包子");
                baozi.flag = false;
                baozi.notify();
                System.out.println("吃货已经吃完了：" + baozi.pi + baozi.xian + "包子,包子铺开始生产包子");
                System.out.println("=================================");
            }
        }
    }
}
