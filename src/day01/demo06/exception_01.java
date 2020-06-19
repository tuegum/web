package day01.demo06;

public class exception_01 {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    public static int getA(){
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(a);
        } finally {
            a = 100;
            return a;
        }
    }
}
