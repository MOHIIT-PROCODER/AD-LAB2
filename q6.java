//max and min array

import java.util.Scanner;

public class q6 {

    public static int imin(int a[], int n) {
        int min = a[0]; 
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int imax(int a[], int n) {
        int max = a[0]; 
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
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

        int minVal = imin(arr, n);
        int maxVal = imax(arr, n);

        System.out.println("Minimum value: " + minVal);
        System.out.println("Maximum value: " + maxVal);

    }    
    }
    

