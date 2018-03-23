import java.util.Scanner;
import java.math.*;
class factorial
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int n,i,j,k,l,t;
        t=scan.nextInt();
        for(int y=0;y<t;y++)
        {
        n=scan.nextInt();
        BigInteger a=new BigInteger("1");
        for(i=1;i<=n;i++)
        {
            a=a.multiply(BigInteger.valueOf(i));
        }
        String str=a.toString();
        int A[]=new int[str.length()];
        for(j=0;j<str.length();j++)
        {
        	A[j]=Integer.parseInt(String.valueOf(str.charAt(j)));
        }
       	k=str.length();
       	l=k-1;
       	int m=0;
       	while(A[l]==0)
       	{
       		m++;
       		l--;
       	}
        System.out.println(m);
    }
}
}