package packageTwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date1 = format.parse("20160718211020");
        Date date2 = format.parse("20160718211321");
        System.out.println(date2.getTime() - date1.getTime());
        char ch = 0x53;
        System.out.println((int)ch);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mm = (a > b ? a : b);
        System.out.println(mm);
    }
}
