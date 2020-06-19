package packageOne;

public class Caculate implements Comparable<Caculate>{

    private String name;
    private double salary;

    public Caculate(String name , double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPecent){
        double raise = salary * byPecent/100;
        salary += raise;
    }

    @Override
    public int compareTo(Caculate o) {
        return Double.compare(salary,o.salary);
    }
}
