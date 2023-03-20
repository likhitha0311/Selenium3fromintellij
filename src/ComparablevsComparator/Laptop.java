package ComparablevsComparator;

public class Laptop implements Comparable<Laptop>
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

    public Laptop(String laptopBrand, double price, int ram) {
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

    @Override
    public int compareTo(Laptop laptop2)
    {
       if(this.getPrice()>laptop2.getPrice())
       {
           return -1;
       }
       else {
           return 1;
       }
    }
}