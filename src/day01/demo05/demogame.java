package day01.demo05;

import java.util.Calendar;
import java.util.Date;

public class demogame {
    public static void main(String[] args) {

        System.out.println("===================");
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println("===================");

        Calendar calendar = Calendar.getInstance();
        calendar.add(1,23);
        Date calendarTime = calendar.getTime();
        String toString = calendar.toString();
        calendar.add(1,23);
        System.out.println(calendarTime);
        System.out.println(toString);


        Hero hero = new Hero();
        hero.setName("武则天");
        hero.setSkill(new Skillimpl());
        /*Skillimpl aa = new Skillimpl();
        hero.setSkill(aa);*/
        Weapon weapon = new Weapon(1433443);
        hero.setWeapon(weapon);
        hero.attack();
        System.out.println("================");

        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~Pia~Pia~");
            }
        };
        hero.setSkill(skill);
        hero.attack();
        System.out.println("==================");

        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu~");
            }
        });
        hero.attack();
    }
}
