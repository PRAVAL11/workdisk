
import java.util.Scanner;

public class constructLowerArray
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
       int b[]=new int[n];
       for(int i=0;i<n;i++)
       {
           int count=0;
           for(int j=i+1;j<n;j++)
           {
               if(a[j]<a[i])
               count++;
            }
            b[i]=count;
        }
         for(int i=0;i<n;i++)
         System.out.print(b[i]+" ");
    }
}
