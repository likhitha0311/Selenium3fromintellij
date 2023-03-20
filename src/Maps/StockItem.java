package Maps;

public class StockItem implements Comparable<StockItem>{

    private final String name;
    private int quantity;
    private double price;

    public StockItem(String name, double price) {
        this.name=name;
        this.quantity = 0;
        this.price = price;
    }

    public StockItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price>0.0)
        {this.price = price;}
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void adjustStock(int quantity)
    {
        int newQuantity=this.quantity+quantity;
        if(newQuantity>=0)
        {
            this.quantity=newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem .equals method");
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+31;
    }



    @Override
    public int compareTo(StockItem o) {
       if(this==o)
           return 0;
       if(o!=null)
       {
         return  this.name.compareTo(o.getName());
       }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}