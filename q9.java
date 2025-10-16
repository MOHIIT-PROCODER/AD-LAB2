public class q9 {
public static void toh(int n, char source , char destination,char auxiliary )
{
if(n==0)
{
    return;
}
else
{
toh(n-1, source, destination, auxiliary);
System.out.println("move disk "+n+" from "+source+" to "+destination);
toh(n, source, destination, auxiliary);
}
}
    public static void main(String[] args) {
        int n=3;

    toh(n,'A','C','B');

    }
    
}
