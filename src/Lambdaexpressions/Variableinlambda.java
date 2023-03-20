package Lambdaexpressions;

public class Variableinlambda
{
    public static void main(String[] args)
    {
        String s="Natural";
        int i1=90;

            doStringStuff(new UpperConcat2() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    System.out.println(s1.toUpperCase() + s2.toUpperCase() + s);
                    ;
                    return s1.toUpperCase() + s2.toUpperCase() + s;
                }
            }, "ABCD", "DEF");
//The above anonymous class can be replaced with lambda expression
        doStringStuff((s1, s2) -> {
            System.out.println(s1.toUpperCase()+s2.toUpperCase()+s);;
            return s1.toUpperCase()+s2.toUpperCase()+s;
        },"chck","DEF");

        OneMethod o = new OneMethod() {
            @Override
            public void showItinery(int p) {
                System.out.println("Class name is "+getClass().getSimpleName());
                System.out.println("Implemented Iteninery"+p);

            }
        };
        //o.showItinery();
      //Above lines of code can also be written as
        OneMethod o2 = (val)->System.out.println("Implemented Iteninery "+val);
        addMethod(o);
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.nonStatic();
        BlockClass blockClass = new  BlockClass();
        blockClass.checkLocal();
    }


    public final static String doStringStuff(UpperConcat2 uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

    public static void addMethod(OneMethod oneMethod)
    {
        oneMethod.showItinery(20);
    }
}

interface UpperConcat2 {
    public String upperAndConcat(String s1, String s2);
}

interface OneMethod{
    void showItinery(int c);
}

class AnotherClass
{
    public void nonStatic()
    {
        OneMethod o2 = (val)->System.out.println("Implemented Iteninery "+val+" "+ getClass().getSimpleName());
        o2.showItinery(90);
    }
}

class BlockClass
{
    public int checkLocal()
    {
        int i=0;
        {
            OneMethod o3 = new OneMethod() {
                @Override
                public void showItinery(int p) {
                    System.out.println("Class name is "+getClass().getSimpleName());
                    System.out.println("Implemented Iteninery"+p);
                   // System.out.println("i value is "+i);
                }
            };
            i++;
            System.out.println("i value is "+i);
            return 0;
        }

    }
}