package day01.demo01;

public class demo03StringGet {
    public static void main(String[] args) {
        //获取字符串的长度 public int length()
        int length = "sadafdfdfasfafdasfdasf".length();
        System.out.println("字符串的长度是：" + length);
        System.out.println("********************************");

        //拼接字符串  public String concat(String str)
        String str1 = "hello" ,str2 = "world";
        System.out.println("拼接str1和str2得到的字符串是：" + str1.concat(str2));
        //获取索引指定位置的单个字符 public char charAt(int index)
        System.out.println("********************************");

        char ch1 = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch1);
        System.out.println("********************************");

        //查找字符串在本字符串中首次出现的索引位置，没有则返回-1  public int indexof(String str)
        String ch2 = "dasfdafasgt5hresdgvnyjhaherhrgvsdg253";
        int index = ch2.indexOf("as");
        System.out.println("第一次索引值是：" +index);

        System.out.println("********************************");
        //split  按照规则切割字符串
        System.out.println("第1种case:");
        String strC = "ccc,eee,fff";
        String[] array1 = strC.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        //"."正则表达式要用"\\."
        System.out.println("第2种case:");
        String strD = "ccc.eee.fff";
        String[] array2 = strD.split("\\.");
        System.out.println("array2数组长度为：" + array2.length);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("********************************");

    }
}
