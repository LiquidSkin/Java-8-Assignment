import java.util.*;
import java.util.Scanner;

public class CountOccurences {
    public static void countWords(String str, int len)
    {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<len; i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i)) +1);
            }
            else
            {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println("The occurences of words are");
        System.out.print(map);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string as input");
        String res = sc.nextLine();
        int len = res.length();
        countWords(res,len);
    }
}
