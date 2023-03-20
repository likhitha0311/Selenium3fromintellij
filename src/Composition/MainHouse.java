package Composition;

public class MainHouse
{
    public static void main(String[] args)
    {
        Window bedrromwindow = new Window(2,"slider","glass");
        Dimension bedrroomdimension = new Dimension(200,7,4);
        Window kitchenwindow = new Window(1,"slider","wood");
        Dimension kitchendimension = new Dimension(100,7,3);
        House house = new House(new Bedroom(bedrroomdimension, bedrromwindow,"master",1),
                new Kitchen("modular","4burner",kitchendimension,kitchenwindow),"Modern");
        house.designHouse();

    }
}