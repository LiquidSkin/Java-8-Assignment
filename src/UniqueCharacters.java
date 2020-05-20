import java.util.*;
import java.util.Scanner;


public class UniqueCharacters {
    public static boolean checkUnique(String str, int len)
    {
          Set<Character> set = new HashSet<Character>();
          for(Character ch : str.toCharArray())
          {
              if(set.contains(ch))
                  return false;
              set.add(ch);
          }
          return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you wish to enter");
        String str = sc.nextLine();
        int len = str.length();
        boolean var = checkUnique(str,len);
        if(var)
        {
            System.out.println("All characters in the string are unique");
        }
        else
        {
            System.out.println("Not all the characters in the string are unique");
        }
    }
}
