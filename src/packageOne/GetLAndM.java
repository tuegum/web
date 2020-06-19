package packageOne;

import java.util.Arrays;

public class GetLAndM{

    public static void main(String args[]){
        Caculate[] staff = new Caculate[3];

        staff[0] = new Caculate("王俊凯",1200000);
        staff[1] = new Caculate("王源",200000);
        staff[2] = new Caculate("易烊千玺",30000);

        staff[2].raiseSalary(1000);
        Arrays.sort(staff);

        for (Caculate caculate:staff)
            System.out.println("name="+ caculate.getName()+",salary="+caculate.getSalary());

    }
}
