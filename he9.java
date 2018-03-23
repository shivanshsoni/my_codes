import java.util.Scanner;
class he9
{
    public static void main(String[]arfd)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int A[]=new int[n];
            for(i=0;i<n;i++)
            {
                A[i]=scan.nextInt();
            }
            int B[]=new int[n*(n+1)];
            l=0;
            for(j=0;j<(1<<n);j++)
            {
                int p=1;
                int s=0;
                for(k=0;k<n;k++)
                {
                    if((j&(1<<k))>0)
                    {
                        p=A[k]^p;
                        s=1;
                    }
                }
                if(s==1)
                {
                    B[l]=p;
                    l++;
                }
            }
            int sum=1;
            for(int y=0;y<l;y++)
            {
                sum=B[y]^sum;
            }
            System.out.println(sum);
        }
    }
}