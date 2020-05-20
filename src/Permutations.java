import java.util.Scanner;

public class Permutations {

    public static void printPermutations(String res, int l, int r)
    {
        if(l == r)
        {
            System.out.println(res);
        }
        else
        {
            for(int i=l; i<=r; i++)
            {
                res = swap(res,l,i);
                printPermutations(res,l+1,r);
                res = swap(res,l,i);
            }
        }

    }
    public static String swap(String res, int i, int j)
    {
        char temp;
        char[] charArray = res.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string as input");
        String res = sc.nextLine();
        int len = res.length();
        printPermutations(res,0,len-1);
    }
}
