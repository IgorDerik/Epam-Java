package Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String...args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Matt", "London", 36, 15, Position.MANAGER));
        employees.add(new Employee("Ivan", "Lviv", 55, 27, Position.MANAGER));
        employees.add(new Employee("Mikel", "Marseille", 36, 13, Position.MANAGER));
        employees.add(new Employee("Merry" , "London", 25, 6, Position.WORKER));
        employees.add(new Employee("Merry ", "London", 25, 6, Position.WORKER));
        employees.add(new Employee("John", "Liverpool", 22, 1, Position.WORKER));
        employees.add(new Employee("Robert", "Manchester", 45, 18, Position.MANAGER));
        employees.add(new Employee("Tom ", "London", 37, 19, Position.DIRECTOR));
        employees.add(new Employee("Eva", "Krakow", 29, 6, Position.WORKER));
        employees.add(new Employee("Jared", "Manchester", 38, 14, Position.WORKER));
        employees.add(new Employee("Jared", "Manchester", 38, 14, Position.WORKER));
        employees.add(new Employee("Andriy", "Ternopil", 23, 4, Position.WORKER));
        employees.add(new Employee("Marta", "Poltava", 33, 10, Position.DIRECTOR));
        employees.add(new Employee("Emma", "Chicago", 22, 3, Position.WORKER));
        employees.add(new Employee("Emilia", "London", 24, 7, Position.WORKER));
        employees.add(new Employee("Emilia", "London", 24, 7, Position.WORKER));

        //testing...
        employees.forEach(System.out::println);
        //employees.stream().forEach(System.out::println);
        System.out.println();
        System.out.println();

        //get first employee
        System.out.println(Functions.getFirstEmployee(employees));
        System.out.println();

        //Print the last four elements of the collection
        employees.stream().skip(employees.size()-4).forEach(System.out::println);

        //Print the names of all managers using the “map” method
        employees.stream().filter(e->e.getPosition().equals(Position.MANAGER)).map(Employee::getName).forEach(System.out::println);

        //Print the number of employees over 30 years old
        System.out.println(employees.stream().filter(e->e.getAge()>30).count());

        //Find all managers and directors in which names start at “М”
        employees.stream().filter(e->e.getPosition().equals(Position.MANAGER)||e.getPosition().equals(Position.DIRECTOR))
                .filter(e->e.getName().startsWith("M")).forEach(System.out::println);

        //Find all the unique workers who have an experience of more than 5 years
        employees.stream().filter(e->e.getPosition().equals(Position.WORKER)).filter(e->e.getWorkExperience()>5).distinct()
                .forEach(System.out::println);

        //Find the average work experience of employees
        System.out.println("avarage exp = " + employees.stream().mapToInt(Employee::getWorkExperience).average());

        //Add each employee one year of experience
        employees.stream().peek(e->{ e.setWorkExperience(e.getWorkExperience()+1); }).forEach(System.out::println);

        //Find all employees not from Manchester, aged 25 to 35 years
        employees.stream().filter(e -> !e.getNativeCity().equals("Manchester")).filter(e -> e.getAge() > 25 && e.getAge()<35)
                .forEach(System.out::println);

        //Create a new collection that will contain all employees from London
        List<Employee> londonEmployees = employees.stream().filter(n -> n.getNativeCity().equals("London")).collect(Collectors.toList());
        londonEmployees.forEach(System.out::println);

        //Sort all employees by age
        employees.stream().sorted(Comparator.comparing(Employee::getAge));
    }

}
