import java.util.Scanner;
import java.util.Arrays;
class garyos
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
            for(int a=0;a<t;a++)
            {
                int sum1=0;
                int(b=1+a;b<t;b++)
                {   
                    sum1=
                }   
            }
        }
    }
}