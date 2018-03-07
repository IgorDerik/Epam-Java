package Lambdas;

import java.util.List;

public class Functions {

    /*
    public static Employee getMyEmployee(List<Employee> employees, MyFunction myFunction) {
        return myFunction.getSomeEmployee(employees);
    }
    */

    public static Employee getFirstEmployee(List<Employee> employees) {
        return employees.get(0);
    }

}
