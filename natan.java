import java.util.Scanner;
import java.util.Arrays;
class natan
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int A[]=new int[n];
            int B[]=new int[n];
            int C[]=new int[n];
            Long sum=0L;
            for(j=0;j<n;j++)
            {
                A[j]=scan.nextInt();
                C[j]=A[j];
                B[j]=scan.nextInt();
                sum=sum+B[j];
            }
            //System.out.println(sum);
            Arrays.sort(C);
            int a=0;
            int b=0;
            Long res=0L;
            for(k=0;k<n;k++)
            {
                if(C[n-1]==A[k])
                {
                    if(a<B[k])
                    {
                        a=B[k];
                    }
                }
                if(C[n-2]==A[k])
                {
                    if(b<B[k])
                    {
                        b=B[k];
                    }
                }
            }
            //System.out.println(a+" "+b);
            res=C[n-1]+C[n-2]+a+b-sum;
            System.out.println(res);
        }
    }
}