package day01.demo01;

public class demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println("hello".equals(str1));

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equalsIgnoreCase(strB));

    }
}
