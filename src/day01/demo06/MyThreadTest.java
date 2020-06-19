package day01.demo06;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        /*RunnableImpl Ri = new RunnableImpl();
        new Thread(Ri).start();*/

        new Thread(new RunnableImpl()).start();

        new MyThread_02().start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }.start();

        new  Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+ "匿名内部类方式实现");
                }
            }
        }).start();
    }

    public static class MyThread_02 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println("MyThread_02" + "  "+ i);
            }
        }
    }

    public static class RunnableImpl implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println("Runnable  " + i);
            }
        }
    }
}
