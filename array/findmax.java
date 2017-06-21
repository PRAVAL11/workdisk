<<<<<<< HEAD

import java.util.Scanner;
public class findmax
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     for(int i=1;i<n;i++)
     {
         if(a[i]<a[i-1])
         {
             System.out.print(a[i-1]);
             break;
            }
        }
    }
 }
=======

import java.util.Scanner;
public class findmax
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     for(int i=1;i<n;i++)
     {
         if(a[i]<a[i-1])
         {
             System.out.print(a[i-1]);
             break;
            }
        }
    }
 }
>>>>>>> 7beb68e187c082b4451f1fb45687226b600cd487
