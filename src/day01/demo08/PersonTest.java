package day01.demo08;

import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("张三",21),
                new Person("李四",12),
                new Person("王五",43),
        };

       /* Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
