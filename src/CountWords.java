import java.util.*;
import java.util.Scanner;

public class CountWords {
    public static int countwords(String str)
    {
        String res = str.trim();
        if(res.isEmpty())
            return 0;
        return res.split("\\s+").length;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you wish to enter");
        String str = sc.nextLine();
        int count = countwords(str);
        System.out.println("The number of words in the string = " + " " + count);

    }


}
