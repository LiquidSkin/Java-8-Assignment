import java.util.*;
import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean checkArmstrong(int n)
    {
        int no = orderNumber(n);
        int tempNo = n;
        int result = 0;
        while(tempNo != 0)
        {
            tempNo = tempNo % 10;
            result = result + powerNumber(tempNo,no);
            tempNo = tempNo / 10;
        }
        return(result == n);
    }
   public static int powerNumber(int x, int y)
   {
       if(y == 0)
           return 1;
       if(y % 2 == 0)
           return powerNumber(x, y /2) * powerNumber(x, y/2);

       return x * powerNumber(x , y/2) * powerNumber(x , y/2);
   }

    public static int orderNumber(int n)
    {
        int res = 0;
        while(n != 0)
        {
            res++;
            n = n / 10;
        }
        return res;

    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you wish to check");
        int n = sc.nextInt();
        boolean var = checkArmstrong(n);
        if(var)
        {
            System.out.println("The number is an Armstrong number");
        }
        else
        {
            System.out.println("The number is not an Armstrong Number");
        }
    }
}
