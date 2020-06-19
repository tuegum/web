package day01.demo06;

import java.util.Scanner;

public class RegisterException_02 {
    static String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args) /*throws RegisterException*/ {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        CheckName(username);
    }

    public static void CheckName(String username) /*throws RegisterException*/ {
        for (String name : usernames) {
            if (name.equals(username)){
                try {
                    throw new RegisterException("该用户名已存在！");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("用户名注册成功！");
    }
}




/*
* 550001035602539*/