package packageOne;

import java.util.Scanner;

public class test {
    private  String pier ;
    private  String xianer ;
   /* private static int baoziNum = 0;*/
    private static boolean baozi_status = false;
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj) {
                        if (baozi_status == true) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else if (baozi_status == false){
                            System.out.println("开始做包子");
                            String BZ = zuobaozi("老虎", "大象");
                            baozi_status = true;
                            System.out.println(BZ);
                        }
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
               while (true){
                   System.out.println("吃货吃包子");
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (obj) {
                           baozi_status = false;
                       System.out.println(baozi_status);
                           System.out.println("吃货吃完了包子");
                           obj.notify();
                   }
               }
            }
        }.start();
    }


    public  static String zuobaozi(String pier,String xianer){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            if (i % 2 ==0){
                System.out.println("请输入包子皮的种类：");
                pier = sc.next();
            }else{
                System.out.println("请输入包子馅的种类：");
                xianer = sc.next();
            }
        }
        return ("做了一个"+pier + "皮"+ xianer + "馅"+ "包子" );
    }

    public String getPier() {
        return pier;
    }

    public void setPier(String pier) {
        this.pier = pier;
    }

    public String getXianer() {
        return xianer;  }

    public void setXianer(String xianer) {
        this.xianer = xianer;
    }

}
