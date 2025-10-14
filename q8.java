import java.util.Scanner;

public class q8 {

    public static int rgcd(int m,int n)
    {
        if(n==0)
        {
            return m;
        }
        else{
            return rgcd(n, m%n);
        }
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter first number:");
        int m = s1.nextInt();

        System.out.println("Enter second number:");
        int n = s1.nextInt();

        int result = rgcd(m, n);

        System.out.println("GCD of " + m + " and " + n + " is: " + result);
    }
    
}
