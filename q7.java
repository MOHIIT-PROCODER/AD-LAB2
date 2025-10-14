//reverse of array

import java.util.Scanner;

public class q7 {
    public static void reverse(int arr[], int n) {
        int l = 0;              
        int h = n - 1;          
        int temp;

        while (l < h) {
            temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        

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

       reverse(arr, n);

    
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    
}
