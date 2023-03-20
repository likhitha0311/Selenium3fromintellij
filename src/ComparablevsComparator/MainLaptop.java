package ComparablevsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLaptop
{
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("HP",45000,12));
        list.add(new Laptop("Dell",40000,16));
        list.add(new Laptop("Lenovo",65000,8));
        //for some method to work it should hav eimplemented comparable interface.So we need to implement comparable interface in Laptop class
        Collections.sort(list);
        System.out.println(list);

        List<Laptop2> list2 = new ArrayList<>();

        list2.add(new Laptop2("HP1",45000,22));
        list2.add(new Laptop2("Dell1",40000,16));
        list2.add(new Laptop2("Lenovo1",65000,8));

        Comparator<Laptop2> c = new Comparator<>()
        {
            public int compare(Laptop2 lap1,Laptop2 lap2)
        {
            if(lap1.getPrice()>lap2.getPrice())
            {
                return 1;

            }
            else {
                return -1;
            }
        }

        };
        Collections.sort(list2,c);
        System.out.println(list2);

        Laptop laptopa= new Laptop("Apple",45000,12);
        Laptop laptopb= new Laptop("Apple",45000,12);
        System.out.println(laptopa.hashCode());
        System.out.println(laptopb.hashCode());
    }
}