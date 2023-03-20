package Composition;

import java.awt.*;

public class Kitchen
{
    private String style;
    private String stoveModel;
    private Dimension dimension;
    private Window window;

    public Kitchen(String style, String stoveModel, Dimension dimension, Window window) {
        this.style = style;
        this.stoveModel = stoveModel;
        this.dimension = dimension;
        this.window = window;
    }

    public void startCooking()
    {
        System.out.println("Turn on the stove");
    }

}