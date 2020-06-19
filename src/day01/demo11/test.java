package day01.demo11;

import java.util.function.Function;

public class test {
    public static int method(String str,Function<String,Integer> fun){
        int num = fun.apply(str);
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        String str = "1243";
        int ret = method(str, s -> Integer.parseInt(s));
        System.out.println(ret);
    }
}
