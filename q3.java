import java.util.Scanner;

public class q3 {
public static int ifibo(int n)
{
    if(n<0){
        return -1;
    }
    else if(n==0){
        return 0;
    } else if(n==1){
        return 1;
    }else{
        return ifibo(n-1)+ifibo(n-2);
    }
}
    public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
        System.out.println("enter the fib0");
           int n=s1.nextInt();
       for(int i=0;i<=n;i++){
        System.out.print(ifibo(i)+" ");
       }
       System.out.println();
    }

 
}
    

