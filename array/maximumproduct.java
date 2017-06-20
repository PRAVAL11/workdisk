
import java.util.Scanner;
public class maximumproduct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int x=0,y=0,z=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>x&&a[i]>y&&a[i]>z)
            {y=x;
            x=a[i];}
            else if(a[i]>y&&a[i]>z)
            {z=y;y=a[i];}
            else if(a[i]>z)
            z=a[i];
        }
        System.out.print(x*y*z);
    }
}
