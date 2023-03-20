package dev;

import java.util.ArrayList;

public class ClassWithoutGenerics
{
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(5);
        addItem(a);
    }

    public static void addItem(ArrayList b)
    {
        for (Object c:b)
        {
            System.out.println((int) c);
            System.out.println((Integer) c);
        }
    }
}
