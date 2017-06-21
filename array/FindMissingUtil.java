
import java.util.Scanner;
public class FindMissingUtil
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int sum1=0,sum2=0;
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        a[i]=sc.nextInt();
        int n2=sc.nextInt();
        int b[]=new int[n2];
        for(int i=0;i<n2;i++)
        b[i]=sc.nextInt();
        for(int i=0;i<n1;i++)
        sum1+=a[i];
        for(int i=0;i<n2;i++)
        sum2+=b[i];
        System.out.print(sum1-sum2);    
    }
}
