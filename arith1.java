import java.util.Scanner;
import java.math.*;
class arith1
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,a,b,c,d;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();
        BigInteger l=new BigInteger("1");
        for(i=1;i<=b;i++)
        {
            l=l.multiply(BigInteger.valueOf(a).mod(BigInteger.valueOf(d)));   
        }
        l=l.divide(BigInteger.valueOf(c).mod(BigInteger.valueOf(d)));
        System.out.println(l);
    }
}