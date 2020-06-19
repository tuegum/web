package day01.demo02;

import java.util.Scanner;

public class demo01StaticField {
    public static void main(String[] args) {
        Student s1 = new Student("易烊千玺",19);
        Student s2 = new Student("王俊凯",21);
//        s1.setAge(3123);
//        s2.setName("王源");
        s1.room = "213";
        System.out.println("姓名：" + s1.getName() + ", 年龄：" + s1.getAge() + ", 教室：" + s1.room + ", 学号：" + s1.getId());
        System.out.println("姓名：" + s2.getName() + ", 年龄：" + s2.getAge()+ ", 教室：" + s2.room + ", 学号：" + s2.getId());
    }

}

class Student{
    private int id;
    private String name;
    private int age;
    static String room;
    static int CountId = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++CountId;
    }

    public Student() {
        CountId++;
    }

    public void addStudent(String name,int age ){
        System.out.println("需要输入几个学生的信息：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

        }
    }
}