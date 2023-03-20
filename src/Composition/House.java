package Composition;

public class House
{
    private Bedroom bedroom;
    private Kitchen kitchen;
    private String houseStyle;

    public House(Bedroom bedroom, Kitchen kitchen, String houseStyle) {
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.houseStyle = houseStyle;
    }

    public void designHouse()
    {
        bedroom.styleBedroom();
        bedroom.configureWindows();
        kitchen.startCooking();
    }
}