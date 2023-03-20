package ComparablevsComparator;

public class Laptop2
{
    private String laptopBrand;
    private double price;

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopBrand='" + laptopBrand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }

    private int ram;

    public Laptop2(String laptopBrand, double price, int ram) {
        this.laptopBrand = laptopBrand;
        this.price = price;
        this.ram = ram;
    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

}