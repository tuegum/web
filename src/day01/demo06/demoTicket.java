package day01.demo06;

public class demoTicket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        System.out.println(run);
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();

    }
}
