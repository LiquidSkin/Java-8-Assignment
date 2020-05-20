import java.util.*;

public class SortedMapByKey {
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<Integer,String>();
        map.put(100,"Jake");
        map.put(54,"lambda");
        map.put(244,"Erwin");
        map.put(10,"Rakesh");
        map.put(55,"Slater");
        map.put(100000,"Loco");
        map.put(333,"Aravindh");

        TreeMap<Integer,String> treemap = new TreeMap<Integer,String>();
        treemap.putAll(map);
        for(Map.Entry<Integer,String> entry: treemap.entrySet())
        {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
