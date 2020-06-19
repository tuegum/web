package day01.demo12.hashtable;

import java.util.Objects;

public class Driver {
    private String name;
    private int age;
    private String sex;

    public Driver() {
    }

    public Driver(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return age == driver.age &&
                name.equals(driver.name) &&
                sex.equals(driver.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}
