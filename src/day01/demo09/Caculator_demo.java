package day01.demo09;

public class Caculator_demo {
    public static final int REQUEST_CONNECT_DEVICE=1;
    public static void main(String[] args) {
        //lambda表达式,(int a,int b),参数列表中的参数的数据类型可以不用写
        invokeCalc(12,34,( a, b)->{
            return a+b;
        });

        //简化lambda表达式
        invokeCalc(REQUEST_CONNECT_DEVICE,45,(a,b)->a+b);

        //匿名内部类
        invokeCalc(13, 34, new Caculate() {
            @Override
            public int Calc(int a, int b) {
                return a+b;
            }
        });

        //lambda表达式，如果参数列表只有一个参数，则可省略（）以及参数类型
       invokeTest(12,a ->{
           return 2*a;
       });

       new Thread(()-> System.out.println("开启新线程")).start();
    }
    public static void invokeCalc(int a, int b,Caculate c){
        int sum = c.Calc(a, b);
        System.out.println(sum);
    }

    public static void invokeTest(int a, Jiekou j){
        int res = j.Test(a);
        System.out.println(res);
    }
}
