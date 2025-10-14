//sum of n number

import java.util.Scanner;

public class q1 {
    public static int nsum(int a[],int n)
    {
        int sum=0;
        
        for(int i=0;i<a.length;i++)
        {
           sum=sum+a[i];
        }
return sum;

    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=s1.nextInt();
        int arr[]=new int[n];

        
        System.out.println("enter numbetr");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s1.nextInt();
        }
        System.out.println(nsum(arr, n));
    }
    
}
