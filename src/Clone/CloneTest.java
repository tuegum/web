package Clone;

public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("雷鸣",23123);
            original.setHireDay(2019,11,5);
            Employee copy = original.clone();
            copy.raiseSalary(100);
            copy.setHireDay(2020,10,30);
            System.out.println("original = " + original);
            System.out.println("copy = " + copy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
