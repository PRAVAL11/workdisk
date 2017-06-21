<<<<<<< HEAD

import java.util.Scanner;
public class findMin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int p=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1])
            {System.out.print(a[i]);p=1;
            break;}
            
        }
        if(p==0)
        System.out.print(a[0]);
    }
}
=======

import java.util.Scanner;
public class findMin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int p=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1])
            {System.out.print(a[i]);p=1;
            break;}
            
        }
        if(p==0)
        System.out.print(a[0]);
    }
}
>>>>>>> 7beb68e187c082b4451f1fb45687226b600cd487
