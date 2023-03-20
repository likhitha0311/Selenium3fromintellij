package Lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLambda
{
    public static void main(String[] args)
    {
        Employee tim = new Employee("tim",1);
        Employee john = new Employee("john",2);
        Employee mike = new Employee("mike",3);
        Employee israel = new Employee("israel",4);
        List<Employee> list = new ArrayList<>();

        list.add(tim);
        list.add(mike);
       list.add(john);
       list.add(israel);


        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list);

        Collections.sort(list, (Employee o1,Employee o2)-> o1.getName().compareTo(o2.getName()));
        System.out.println(list);

       // UpperConcat uc = (s1, s2) -> {return s1.toUpperCase() +  s2.toUpperCase();};
        //When you are using braces make sure to add return whether 1 line or mmore line,  otherwise no need.
        UpperConcat uc = (s1, s2) ->  s1.toUpperCase() +  s2.toUpperCase();
        //u can remember uc as the object of implemnettion class of iNTERFACE
        String sillyString = doStringStuff(uc, list.get(0).getName(), list.get(1).getName());
        System.out.println(sillyString);

    }
    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

    }


class Employee
{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}