<<<<<<< HEAD

import java.util.Scanner;
public class subArraySum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int x=sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum==x)
                {
                    System.out.print(i+" "+j);p=1;
                    break;
                }
                else if(sum>x)
                break;
            }
        }
        if(p==0)
        System.out.print("no element");
    }
}
=======

import java.util.Scanner;
public class subArraySum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int x=sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum==x)
                {
                    System.out.print(i+" "+j);p=1;
                    break;
                }
                else if(sum>x)
                break;
            }
        }
        if(p==0)
        System.out.print("no element");
    }
}
>>>>>>> 7beb68e187c082b4451f1fb45687226b600cd487
