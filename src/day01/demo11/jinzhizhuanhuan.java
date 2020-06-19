package day01.demo11;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Socket;
import java.text.Format;

/*
进制转换
* */
public class jinzhizhuanhuan {
    public static void main(String[] args) throws IOException {
        String str = "0x23";
//        double ret = new BigInteger(str, 16).intValue();
        BigDecimal bigDecimal = new BigDecimal(str);
        System.out.println(bigDecimal);
//        System.out.println(ret);
    }
}
