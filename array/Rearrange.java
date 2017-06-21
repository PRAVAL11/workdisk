
import java.util.Scanner;
public class Rearrange
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
       int b[]=new int[n];
       int j=0,k=n-1;
       for(int i=0;i<n;i++)
       {
           if(i%2==0)
           {b[i]=a[k];k--;}
           else
           {b[i]=a[j];j++;}
        }
        for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
}
