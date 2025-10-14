//fact 0f number

import java.util.Scanner;

public class q2 {
public static int ifact(int n)
{
    int sum=1;
for(int i=1;i<=n;i++)
{
sum=sum*i;
}
return sum;
}
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
        System.out.println("enter the number that u want to fact");
           int n=s1.nextInt();
       System.out.println(ifact(n));
    }

 
}
    

