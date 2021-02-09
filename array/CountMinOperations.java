
import java.util.Scanner;
public class CountMinOperations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int b[]=new int [n];
        int count=n;
        for(int i=0;i<n;i++)
        b[i]=1;
        boolean status=true;
        while(status)
        {
            int p=0;
            
            for(int i=0;i<n;i++)
            {
                if(b[i]*2>a[i])
                {
                    p=1;
                    break;
                }
            }
            if(p==1)
            {
                for(int i=0;i<n;i++)
                {
                    if(b[i]!=a[i])
                    {b[i]+=1;
                    count++;}
                }
            }
            else
            {
               for(int i=0;i<n;i++)
               b[i]*=2;
               count++;
            }
            for(int i=0;i<n;i++)
            {
                if(b[i]==a[i])
                status=false;
                else
                {status=true;break;}
            }
        }
        System.out.print("Count"+count);
    }
}
