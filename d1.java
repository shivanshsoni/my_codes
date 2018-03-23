import java.util.Scanner;
class d1
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            k=scan.nextInt();
            int A[]=new int[n];
            int a=0;
            int b=0;
            for(j=0;j<n;j++)
            {
                A[j]=scan.nextInt();
                if(A[j]==1)
                {
                    a++;
                }
                else
                {
                    b++;
                }
            }
            if(a==n||b==n)
            {
                for(int h=0;h<n;h++)
                {
                    System.out.print(A[h]+" ");
                }
            }
            else
            {
            int B[]=new int[n];
            for(int u=0;u<n;u++)
            {
                B[u]=0;
            }
            for(l=1;l<=k;l++)
            {
                for(int y=0;y<n;y++)
                {
                    B[y]=0;
                }
                if(l%2!=0)
                {
                    for(int y=1;y<n-1;y++)
                    {
                        if(A[y-1]==1&&A[y+1]==1&&A[y]==0)
                        {
                            B[y]=1;
                        }
                    }
                }
                else
                {
                    for(int y=1;y<n-1;y++)
                    {
                        if(y==1&&A[y]==1)
                        {
                            B[y-1]=1;
                        }
                        else if(A[y-1]==1&&A[y+1]==1)
                        {
                            B[y]=0;
                        }
                        if(y==n-1&&A[y-1]==1&&n>2)
                        {
                            B[y-1]=1;
                        }
                    }
                }
                for(int y=0;y<n;y++)
                {
                    A[y]=B[y];
                }
            }
            for(int u=0;u<n;u++)
            {
                System.out.print(B[u]+" ");
            }
        }
        System.out.println(" ");
    }
}
}