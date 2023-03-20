package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args)
    {
        Map<String, String> map= new HashMap<>();
        map.put("Java Enhanced","Easy");
        map.put("Python","Medium");
        map.put("C","Easy");
        map.put("C++","Beginner");
        System.out.println(map.get("Python"));

        for(String key: map.keySet())
        {
            System.out.println(key+" : "+map.get(key));
        }

        System.out.println(map.containsKey("Java"));

        //To remove key value pair based on exact match

        System.out.println(map.remove("Python"));//this will remove Python and its value without checking anythin
        if(map.remove("Java Enhanced","Easyordifficult")){
            System.out.println("Removed");};//this will remove Java Enhanced only if its valueis Easy

        for(String key: map.keySet())
        {
            System.out.println(key+" : "+map.get(key));
        }
        //replace old value with new value
        map.replace("C++","Advanced");
        System.out.println(map.get("C++"));
    }
}