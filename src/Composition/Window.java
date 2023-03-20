package Composition;

public class Window
{
    private int noOfWindows;
    private String windowType;

    private String windowmaterial;

    public Window(int noOfWindows, String windowType, String windowmaterial) {
        this.noOfWindows = noOfWindows;
        this.windowType = windowType;
        this.windowmaterial = windowmaterial;
    }

    public int getNoOfWindows() {
        return noOfWindows;
    }

    public String getWindowType() {
        return windowType;
    }

    public String getWindowmaterial() {
        return windowmaterial;
    }
}