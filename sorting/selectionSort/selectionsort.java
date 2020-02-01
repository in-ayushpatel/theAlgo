import java.util.*;
public class selection{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter number of element in array ");
        n= s.nextInt();
        int[] a = new int [n];
        System.out.println("enter element of array");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            int p=a[i];
            a[i]=a[min];
            a[min]=p;
        }
        System.out.println("array after sorting with the help of selection sort");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}