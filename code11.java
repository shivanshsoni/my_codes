import java.util.Scanner;
import java.math.*;
class code11
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,k,l;
        int j;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int x=scan.nextInt();
            int bi=x;
            for(j=1;j<=n;j++)
            {
                bi=((bi%1000003)*(j%1000003))%1000003;
            }
            System.out.println(bi%1000003);
        }
    }
}