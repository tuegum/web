package day01.demo01;

import java.util.Scanner;



/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。// toCharArray
种类有：大写字母，小写字母，数字，其他
 */
public class demo05StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();
        int countBig = 0 ;
        int countSmall = 0;
        int countNumber = 0;
        int countOthers = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z'){
                countBig++;
            }
            else if ('a' <= ch && ch <= 'z'){
                countSmall++;
            }
            else if ('0' <= ch && ch <= '9'){
                countNumber++;
            }
            else{
                countOthers++;
            }
        }
        System.out.println("大写子母有：" + countBig);
        System.out.println("小写字母有：" + countSmall);
        System.out.println("数字有：" + countNumber);
        System.out.println("其他有：" + countOthers);
    }
}
