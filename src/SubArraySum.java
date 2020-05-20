import java.util.*;

public class SubArraySum {
    public static int kadaneAlgorithm(int[] arr, int n)
    {
        int max_so_far = 0;
        int max_so_end = Integer.MIN_VALUE;
        for(int j : arr)
        {
            max_so_far = max_so_far + j;
            if(max_so_end < max_so_far)
            {
                max_so_end = max_so_far;
            }
            if(max_so_far < 0)
            {
                max_so_far = 0;
            }
        }
        return max_so_end;
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
        int no = kadaneAlgorithm(arr,n);
        System.out.println("The maximum subarray sum is" + " " + no);

    }

}