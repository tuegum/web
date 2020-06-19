package packageOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

/**
 * static void showMessageDialog(Component parent, Object message)
 * 显示一个包含一条消息和OK按钮的对话框，这个对话框将位于其parent组件的中央。
 * 如果parent为null，对话框将显示在屏幕的中央
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Timer(int interval, ActionListener listener)构造一个定时器，每隔interval毫秒通告listener一次
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * void start(); 启动定时器，定时器将调用监听器的actionPerformed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * void stop(); 停止计时器，定时器将不再调用监听器的actionPerformed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * static Toolkit getDefaultToolkit();  获得默认的工具箱。工具箱包含有关GUI环境的信息。
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * void beep(); 发出一声铃响
 */

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        // construct a timer that calls the listener
        //once every 1 seconds
        Timer timer = new Timer(1000,listener);
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }

    static class TimePrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is" + " " + new Date() + " ");
            Toolkit.getDefaultToolkit().beep();
            Random r = new Random();
            for (int i = 0; i < 100; i++) {
                int num = r.nextInt(10);
                System.out.println("num = " + num);
            }
        }
    }
}
