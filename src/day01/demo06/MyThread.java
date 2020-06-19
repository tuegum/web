package day01.demo06;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("MyThread_01" + "  " + i);
        }
    }
}
