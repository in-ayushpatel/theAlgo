import java.util.*;
public class quicksort{
    public static int quick(int a[],int s,int e)
    {
        int i=s,p;
        int pivot = a[s];
        for(int j=s+1;j<=e;j++)
        {
            if(a[j]<pivot)
            {
                p=a[i];
                a[i]=a[j];
                a[j]=p;
                i++;
            }
        }
        a[i]=pivot;
        return(i);

    }
    public static void quickee(int a[] ,int s,int e)
    {
        if(s<e)
        {
        int k = quick(a,s,e);
        quickee(a,s,k-1);
        quickee(a,k+1,e);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        int n;
        System.out.println("enter the number of element in array ");
        n=s.nextInt();
        int [] a = new int [n];
        System.out.println("enter element of array");
        for(int i=0;i<n;i++)
         {
            a[i]= s.nextInt();
         }
         quickee(a,0,n-1);
         System.out.println("array after sorting when we sort array from quicksort method");
         for(int i=0;i<n;i++)
         {
             System.out.println(a[i]);
         }
    }
}