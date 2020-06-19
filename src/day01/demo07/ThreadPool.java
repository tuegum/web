package day01.demo07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建线程！");
            }
        });
        RunnableImpl ri = new RunnableImpl();
        Thread td = new Thread(ri);
        es.submit(td);
        es.submit(td);
        es.submit(td);
        es.submit(new Thread(new RunnableImpl()));

    }
}
