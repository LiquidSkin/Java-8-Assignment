import java.util.*;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String you wish to reverse");
       String str = sc.next();
       String reversed = str.chars()
                .collect(StringBuilder::new, (b,c) -> b.insert(0,(char)c), (b1,b2) -> b1.insert(0, b2))
                .toString();
       System.out.println(reversed + " ");
    }
}
