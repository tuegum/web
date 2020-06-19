package day01.demo02;

import java.util.Arrays;



/*
备注：
1.如果是数值，sort按照升序从小到大
2.如果是字母，sort按照字母升序
3.如果是自定义的类型，那么这个这个类需要有Compareble或者Comparetor接口的支持
 */
public class demo02Arrays {
    public static void main(String[] args) {
        int[] array1 = {2,5,1,6,38};
        Arrays.sort(array1);//升序
        System.out.println(Arrays.toString(array1));//按照默认格式将数组转变成为字符串
        System.out.println("=========================");

        String[] array2 = {"zxsd","fewf","vasda"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println("=========================");

        String str1 = "asd2313SADACSC5chsdfkja";
        //String => 字符数组数组  toCharArray
        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}
