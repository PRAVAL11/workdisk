
import java.util.Scanner;
public class peakelement
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                if(a[i+1]<a[0])
                {System.out.print(a[0]);break;}
            }
            else if(i==n-1)
            {
                if(a[i]>a[i-1])
                {System.out.print(a[i]);break;}
            }
            else
            {
                if(a[i]>a[i+1]&&a[i]>a[i-1])
                {System.out.print(a[i]);break;}
            }
        }
    }
}
