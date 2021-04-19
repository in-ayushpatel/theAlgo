import java.util.Scanner;

public class insertionSort {
    public static void sort(int [] a,int n)
    {

      for(int i=1;i<n;i++)
      {
          int temp =a[i];

              for(int j=i-1;j>=0;j--)
              {
                   if(a[j]>temp)
                   {
                       a[j+1]=a[j];
                       if(j==0)
                        a[j]=temp;
                   }
                   

              }
      }
    }
    public static void main(String []args)
    {
        Scanner scan = new Scanner (System.in);
        int n=scan.nextInt();
        int [] a = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        sort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
