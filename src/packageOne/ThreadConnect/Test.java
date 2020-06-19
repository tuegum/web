package packageOne.ThreadConnect;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("张三",21);
        map.put("李四",22);
        map.put("王五",23);
        map.put(12,"王韩雪");

        System.out.println(map.get("李四"));
        System.out.println(map.get(12));
    }
}
