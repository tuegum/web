package day01.demo05;

public class Hero {
    private String name;
    private Skill skill;
    private Weapon weapon;

    public Hero() {
    }

    public Hero(String name, Skillimpl skill,Weapon weapon) {
        this.name = name;
        this.skill = skill;
        this.weapon = weapon;
    }

    public void attack(){

        System.out.println("我叫：" + name+  "  使用武器： " + weapon.getCode());
        skill.use();
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



    public void setName(String name) {
        this.name = name;
    }


    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
