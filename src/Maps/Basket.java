package Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem,Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity)
    {
        if(item!=null&&quantity>0)
        {
            int inBasket = list.getOrDefault(item,0);
            list.put(item,inBasket+quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s=  "Shopping Basket "+name+"contains "+list.size()+" items";
        double totalPrice=0.0;
        for(Map.Entry<StockItem,Integer> item :list.entrySet())
        {
            s= s+item.getKey()+item.getValue()+" purchased";
            totalPrice+=item.getKey().getPrice()*item.getKey().getQuantity();

        }
        return "Total cost is "+totalPrice;
    }
}