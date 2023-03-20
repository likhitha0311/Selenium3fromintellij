package Lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UsingFunctionInterface
{

    public static void main(String[] args)
    {
        Employee tim = new Employee("tim buchalka", 1);
        Employee john = new Employee("john dppper", 2);
        Employee mike = new Employee("mike jade", 3);
        Employee manu = new Employee("manu", 4);
        Employee shahlini = new Employee("shahlini", 5);
        Employee irahayden = new Employee("ira hayden", 6);
        Employee gautam = new Employee("gautam", 8);
        List<Employee> list = new ArrayList<>();
        list.add(tim);
        list.add(mike);
        list.add(john);
        list.add(manu);
        list.add(shahlini);
        list.add(irahayden);
        list.add(gautam);
        Consumer<Employee> con = employee -> System.out.println(employee.getName());
        Consumer<String> conString = ele -> System.out.println("Element with string length >=3 is "+ele);
        Function<Employee,String> functionINterface = employee -> employee.getName().substring(0,4);
        Predicate<String> pri = (s)->s.length()>=3;
        for(Employee e:list)
        {
            con.accept(e);
        }
        list.forEach(con);
        System.out.println("^".repeat(10));
       List<String>newList= list.stream().map(functionINterface).filter(pri).peek(conString).collect(Collectors.toList());
        System.out.println(newList);

        List<Employee> newsortedList= list.stream().filter(employee -> employee.getId()>=2).sorted((e1,e2)->e1.getId()>e2.getId()?-1:1).collect(Collectors.toList());
        System.out.println(newsortedList);

        list.stream().map((e)-> {
            if(e instanceof Employee)
            {
                return 1;
            }
            else {
                return -1;
            }
        });

        Department hr=new Department("hr");
        Department accounting=new Department("accounting");
        Department it=new Department("it");
        List<Department> departmentlist = new ArrayList<>();
        departmentlist.add(it);
        departmentlist.add(hr);
        departmentlist.add(accounting);

        hr.addEmployee(tim);
        accounting.addEmployee(john);
        accounting.addEmployee(mike);
        accounting.addEmployee(irahayden);
        hr.addEmployee(manu);
        it.addEmployee(shahlini);

        List<String>employeenames = departmentlist.stream().flatMap(d->d.getEmployees().stream().map(e->e.getName())).collect(Collectors.toList());
        System.out.println(employeenames);

        List<Employee>employees = departmentlist.stream().flatMap(d->d.getEmployees().stream()).collect(Collectors.toList());
        System.out.println(departmentlist.stream().flatMap(d->d.getEmployees().stream()));
        System.out.println("Employees within each department are "+employees);
    }


}