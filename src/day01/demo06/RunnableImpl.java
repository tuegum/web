package day01.demo06;

public class RunnableImpl implements Runnable{
    private int ticket =100;
    Object object = new Object();
    @Override
    public void run() {
        System.out.println("this" + this);
       /* synchronized (object) {*/
            while (ticket > 0) {
                PayTicket();
            }
        /*}*/
    }
    public synchronized void PayTicket(){
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "  ==>" + "正在卖第" + ticket + "张票！");
            ticket--;
        }
    }
}

