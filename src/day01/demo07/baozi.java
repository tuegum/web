package day01.demo07;

import java.util.Scanner;

public class baozi extends Thread{
    private  String pier ;
    private  String xianer ;
    private int baoziNum = 0;

    private boolean baozi_status = false;
    Object obj = new Object();

    @Override
    public void run() {
        if (!baozi_status){
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            String BZ = zuobaozi("老虎","大象",baoziNum);
            System.out.println(BZ +",包子数量为:" + baoziNum);
        }
    }

    public static String zuobaozi(String pier,String xianer,int baoziNum){
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            if (i % 2 ==0){
                System.out.println("请输入包子皮的种类：");
                pier = sc.next();
            }else{
                System.out.println("请输入包子馅的种类：");
                xianer = sc.next();
            }
        }
        baoziNum++;
        return ("做了一个:"+pier + "皮"+ xianer + "馅"+ "包子" );
    }



    public baozi() {
    }

    public String getPier() {
        return pier;
    }

    public void setPier(String pier) {
        this.pier = pier;
    }

    public String getXianer() {
        return xianer;
    }

    public void setXianer(String xianer) {
        this.xianer = xianer;
    }

    public int getBaoziNum() {
        return baoziNum;
    }

    public void setBaoziNum(int baoziNum) {
        this.baoziNum = baoziNum;
    }
}
