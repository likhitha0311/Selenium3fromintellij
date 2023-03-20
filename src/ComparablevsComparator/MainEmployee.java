package ComparablevsComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainEmployee
{
    public static void main(String[] args) {

        Employee e1=new Employee(1,"Ajay");
        Employee e2=new Employee(1,"Ajay");
        Map<Employee, String> map=new HashMap<>();
        map.put(e1,"Jim");
        map.put(e2,"Jim");
        System.out.println(map);

    }
}

class Employee
{
    private int id;
    private String name;

    public Employee(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   // @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && name.equals(employee.name);
//    }

    //alternate approach using instanceof

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if(obj instanceof Employee)
        {
            String oname = ((Employee)obj).getName();
            return this.id == ((Employee)obj).id && this.name.equals(oname);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}