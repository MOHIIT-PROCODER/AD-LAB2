//ibinarysearch

import java.util.Scanner;

public class q5 {

public static int ibinarysearch(int a[],int t,int l,int h)
{if(l<=h)
    {
    int mid = (l+h)/2;   
    
    if(a[mid]==t)
    {
        return mid;
    }
    else if(a[mid]<t)
    {
return ibinarysearch(a,  t, mid+1, h);
    }
    else
    {
       return ibinarysearch(a, t, l, mid-1);
    }
}
return -1;
}

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s1.nextInt();
        int arr[]=new int[n];
      
System.out.println("enter number");
        for(int i=0;i<n;i++)
        {
        arr[i]=s1.nextInt();
        }
  System.out.println("enter the target");
        int t=s1.nextInt();
System.out.println(ibinarysearch(arr, t, 0, n-1));
        
    }    
}
