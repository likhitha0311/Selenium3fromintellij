package Polymorphism;

public class MainCar {
    public static void main(String[] args) {
        System.out.println(getString());
        System.out.println(switChLambda());
        ;
        for (int i = 0; i < 10; i++) {
            Car car = randomNumbers();
            car.startEngine();
            car.accelerate();
            car.pressBrakes();
        }
    }

    public static Car randomNumbers() {
        int a = (int) (Math.random() * 3) + 1;
        System.out.println("Random number is " + a);
        switch (a) {
            case 1 -> {
                return new Ferrari(2, "Ferrari");
            }
            case 2 -> {
                return new Bugati(2, "Bug");
            }
            case 3 -> {
                return new HondaCity(2, "HondaCity");
            }
            default -> {
                return new Car(2, "Car");
            }
        }

    }


    public static String getString() {
        String month = "Janxx";
        switch (month) {
            case "Jan" -> {
                System.out.println("Express way");
                return "hello";
            }
            case "Feb" -> {return "Summer";}

            case "Mar" -> {
                return "Holidays";
            }
            default -> {
                return "Invalid";
            }
        }
        //return "hello";
    }

    public static String switChLambda() {
        String month = "Jan";
        return switch (month) {
            case "Jan" -> "This is January";
            case "Feb" -> "Summer";
            case "Mar" ->{
                System.out.println("Heyy");
            yield "Holidays";}
            default -> "Invalid";
        };

    }
}
 class Car
{
    private int noofcylinders;
    private int wheels;
    private String name;
    private boolean engine;
    public Car(int noofcylinders, String name) {
        this.noofcylinders = noofcylinders;
        this.name = name;
        this.wheels =4;
        this.engine = true;
    }


    public void startEngine()
    {
        System.out.println("Engine started "+getClass().getSimpleName());
    }
    
    public void accelerate()
    {
        System.out.println("Increasing speed "+getClass().getSimpleName());
    }
    public void pressBrakes()
    {
        System.out.println("Pressing brakes "+getClass().getSimpleName());
    }

    public int getNoofcylinders() {
        return noofcylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Ferrari extends Car{

    public Ferrari(int noofcylinders, String name) {
        super(noofcylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari engine accelerated");
    }

    @Override
    public void pressBrakes() {
        System.out.println("Ferrari engine brakes");
    }
}
class Bugati extends Car{

    public Bugati(int noofcylinders, String name) {
        super(noofcylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Bugati engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bugati engine accelerated");
    }

    @Override
    public void pressBrakes() {
        System.out.println("Bugati engine brakes");
    }
}

class HondaCity extends Car{

    public HondaCity(int noofcylinders, String name) {
        super(noofcylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("HondaCity engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("HondaCity engine accelerated");
    }

    @Override
    public void pressBrakes() {
        System.out.println("HondaCity engine brakes");
    }
}