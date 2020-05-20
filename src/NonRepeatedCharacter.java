import java.util.*;
import java.util.Scanner;

public class NonRepeatedCharacter {

    public static void nonRepeat (String str, int len)
    {
        Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i=0; i<str.length(); i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else
            {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
        for(Character a: map.keySet())
        {
            if(map.get(a) == 1)
            {
                System.out.println("The first non repeating Character is" + a);
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you wish to enter");
        String str = sc.nextLine();
        int len = str.length();
        nonRepeat(str,len);
    }
}
