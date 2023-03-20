package Maps;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String,StockItem>list;

    public StockList() {
        this.list = new LinkedHashMap<>();//To maintain order of insertion use Linkedhashmap
    }

    public int addItemToList(StockItem item)
    {
        if(item!=null)
        {
            StockItem inStock = list.getOrDefault(item.getName(),item);//get the value associated with the key, if key is not found return the default
            if(inStock != item)
            {
                item.adjustStock(item.getQuantity());
            }
            list.put(item.getName(),item);
            return item.getQuantity();
        }
        return 0;
    }

    public int sellStock(String itemname, int quantity)
    {
        StockItem inStock = list.getOrDefault(itemname,null);
        if((inStock!=null)&&(inStock.getQuantity()>=quantity)&&(quantity>0))
        {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key)
    {
        return list.get(key);
    }
    public Map<String,StockItem> Items(){
        return Collections.unmodifiableMap(list);//this is to prevent mutability or someone changing our list if we return as it is
    }

    @Override
    public String toString() {
        double totalPrice=0.0;
        for(Map.Entry<String,StockItem> item :list.entrySet())
        {
            totalPrice+=item.getValue().getPrice()*item.getValue().getQuantity();
            System.out.println("There are "+item.getKey()+"in stock with "+item.getValue().getQuantity());
        }
        return "Total cost is "+totalPrice;
    }
}