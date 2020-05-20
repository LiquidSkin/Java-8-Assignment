
import java.util.*;
import java.util.Scanner;
public class maxValue {
    public static int maximumElement(int[] arr, int n)
    {
        int max = Integer.MIN_VALUE;
        for(int j : arr)
        {
            if(j > max)
            {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = maximumElement(arr,n);
        System.out.println("The maximum element of the array is" + " " + max);

    }


}
