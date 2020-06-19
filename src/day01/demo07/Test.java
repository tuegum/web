package day01.demo07;

public class Test {
    public static void main(String[] args) {
        baozi bz = new baozi();
        bz.start();

        new Thread(){
            @Override
            public void run() {

            }
        }.start();
    }

}
