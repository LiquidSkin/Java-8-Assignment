import java.util.*;

public class SortedMapByValue {
    public static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Abinav" , 500);
        map.put("Jackson",770);
        map.put("Lucy",180);
        map.put("RalphLauren",590);
        map.put("Gibson",220);
        map.put("Norris",740);
        map.put("Zeus",630);
        List<Map.Entry<String, Integer> > list =
                new LinkedList<>(map.entrySet());

        // Sort the list
        Collections.sort(list, (o1, o2) -> (o1.getValue()).compareTo(o2.getValue()));
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        for (Map.Entry<String, Integer> en : temp.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

    }
}
