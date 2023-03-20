package Composition;

public class Bedroom
{
    private Dimension dimension;
    private Window window;
    private String bedroomType;
    private int noofbeds;

    public Bedroom(Dimension dimension, Window window, String bedroomType, int noofbeds) {
        this.dimension = dimension;
        this.window = window;
        this.bedroomType = bedroomType;
        this.noofbeds = noofbeds;
    }

    public void styleBedroom()
    {
        System.out.println("No of beds "+noofbeds);

    }
    public void configureWindows()
    {
        System.out.println("No of windows "+window.getNoOfWindows()+"window style is"+window.getWindowType()+"windows are made out of "+window.getWindowmaterial());

    }

}