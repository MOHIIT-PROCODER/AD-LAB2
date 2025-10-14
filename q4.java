//linear search

import java.util.Scanner;

public class q4{

    public static int ilsearch(int a[],int t,int i)
    {
if(a[i]==t)
{
    return i;
}
else 
{
    return ilsearch(a,t,i+1);
}

            }
    public static void main(String[] args) {
        
Scanner s1=new Scanner(System.in);
        System.out.println("enter the size of array");
           int n=s1.nextInt();
           int arr[]=new int[n];
           System.out.println("enter target");
           int t=s1.nextInt();
           System.out.println("ENTER NUMBER");
       for(int i=0;i<arr.length;i++){
    arr[i]=s1.nextInt();
       }
       System.out.println(ilsearch(arr, t, 0));
    }


    
}