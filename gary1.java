import java.util.Scanner;
import java.util.Arrays;
class gary1
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int n=scan.nextInt();
        int A[]=new int[t];
        int sum=0;
        for(i=0;i<t;i++)
        {
            A[i]=scan.nextInt();
            sum=sum+A[i];
        }
        if(sum<=n)
        {
            System.out.println(n);
            System.out.print(t+" ");
            for(k=1;k<=t;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println("");
        }
        else
        {
            System.out.println(n);
            sum=0;
            l=0;
            int y=0;
            int C[]=new int[t];
            int p=0;
            for(p=0;p<t;p++)
            {
                sum=sum+A[p];
                if(sum>n)
                {
                    break;
                }
            }
            System.out.print(p+" ");
            for(int u=1;u<=p;u++)
            {
                System.out.print(u+" ");
            }
            System.out.println(" ");
        }
    }
}