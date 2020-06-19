package day01.demo06;
/*
IntelliJ IDEA 2019.2.2 (Ultimate Edition)
Build #IU-192.6603.28, built on September 6, 2019
Licensed to 飞象 码农
You have a perpetual fallback license for this version
Subscription is active until January 15, 2021
Runtime version: 11.0.3+12-b304.56 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
Windows 10 10.0
GC: ParNew, ConcurrentMarkSweep
Memory: 1965M
Cores: 8
Registry:
Non-Bundled Plugins:
*/
public class system {
    public static void main(String[] args) {
        method_01();
    }

    private static void method_01() {
        long S1 = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long S2 = System.currentTimeMillis();
        System.out.println("程序运行： " + (S2-S1) + "毫秒");
    }
}
