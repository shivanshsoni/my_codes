import java.util.Scanner;
class code10
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        k=scan.nextInt();
        int A[]=new int[t];
        int B[]=new int[t];
        for(i=0;i<t;i++)
        {
            A[i]=scan.nextInt();
        }
        for(j=0;j<t;j++)
        {
            B[j]=scan.nextInt();
        }
        for(l=0;l<k;l++)
        {
            Long sum=0L;
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            if(a==1)
            {
                for(int y=b;y<=c;y++)
                {
                    if(y%2==0)
                    {
                        sum=sum+A[y];
                    }
                    else
                    {
                        sum=sum+B[y];
                    }
                }
            }
            if(a==2)
            {
                for(int y=b;y<=c;y++)
                {
                    if(y%2==0)
                    {
                        sum=sum+B[y];
                    }
                    else
                    {
                        sum=sum+A[y];
                    }
                }
            }
            System.out.println(sum);
        }
    }
}