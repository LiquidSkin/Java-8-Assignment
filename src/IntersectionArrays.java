import java.util.*;
import java.util.Scanner;

public class IntersectionArrays {
    public static void findIntersection(int[] arr1, int[] arr2, int m, int n)
    {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(Integer a : arr1)
        {
            set1.add(a);
        }
        for(Integer b: arr2)
        {
            set2.add(b);
        }
        set1.retainAll(set2);
        System.out.println("The Intersection of the two arrays are");
        for(Integer i : set1)
        {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first Array");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter the elements of the first array");
        for(int i=0; i<m; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the second Array");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of the second Array");
        for(int j=0; j<n; j++)
        {
            arr2[j] = sc.nextInt();
        }
        findIntersection(arr1,arr2,m,n);
    }

}
