package Composition;

public class Dimension
{
    private int floorSizeinsqft;
    private int roomHeight;
    private int walls;

    public Dimension(int floorSizeinsqft, int roomHeight, int walls) {
        this.floorSizeinsqft = floorSizeinsqft;
        this.roomHeight = roomHeight;
        this.walls = walls;
    }
}