
import java.util.*;
public class alternate
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
       int sum1=0,sum2=0;
       for(int i=0;i<n;i++)
       {
           if(i%2==0)
           sum1+=a[i];
           else
           sum2+=a[i];
        }
        System.out.print(sum1+" "+sum2);
    }
}
