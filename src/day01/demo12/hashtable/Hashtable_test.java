package day01.demo12.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Hashtable_test {
    public static void main(String[] args) {
        Car car1 = new Car("宝马","A88888",800000);
        Car car2 = new Car("奔驰","A99999",900000);
        Car car3 = new Car("奔驰","A99999",900000);

        Driver driver1 = new Driver("张三",18,"男");
        Driver driver2 = new Driver("李四",19,"女");
        Driver driver3 = new Driver("李四",19,"女");

        Map map = new HashMap();
        map.put(car1,driver1);
        map.put(car2,driver2);
        map.put(1,"22");

        Object o = map.get(car1);
        System.out.println(o);

        Object o1 = map.get(1);
        System.out.println(o1);

        Object o2 = map.get(new Car("奔驰", "A99999", 900000));
        System.out.println(o2);


    }
}
