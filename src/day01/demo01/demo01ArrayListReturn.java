package day01.demo01;

import java.util.ArrayList;
import java.util.Random;
/*
题目：
用一个大集合存放20个随机数字，然后赛筛选其中的偶数元素，放到小集合当中
要求要用自定义的方法来实现筛选

分析：
1.首先要创建一个大集合，用来储存int数字：<Integer>
2.随机数字用Random nextInt
3.循环20次，把随机数字放到大集合当中：for循环，add
4.定义一个方法，用来进行筛选
筛选：根据大集合，筛选符合的元素，得到小集合
三要素：
返回值类型：ArrayList小集合，里面元素个数不确定
方法名称：getSmallList
参数列表:ArrayList大集合(里面装着20个随机数)
5.判断(if)是偶数：num %2 == 0
6.如果是偶数，就放到小集合的当中，否则就不放。
 */
public class demo01ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数一共有：" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        //创建一个小集合
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num %2 ==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
