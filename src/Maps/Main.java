package Maps;

public class Main
{
    private static StockList stocklist = new StockList() ;
    public static void main(String[] args) {
        StockItem item1= new StockItem("bread",100,2);
        StockItem item2= new StockItem("butter",120,23);
        StockItem item3= new StockItem("jam",110,21);
        StockItem item4= new StockItem("rosewater",1,44);
        StockItem item5= new StockItem("juice",2,45);
        StockItem item6= new StockItem("jam",110,26);
        stocklist.addItemToList(item1);
        stocklist.addItemToList(item2);
        stocklist.addItemToList(item3);
        stocklist.addItemToList(item4);
        stocklist.addItemToList(item5);
        stocklist.addItemToList(item6);
        System.out.println(stocklist);


    }
}