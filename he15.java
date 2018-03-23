import java.util.Scanner;
import java.util.Arrays;
class he15
{
    public static void main(String[]arsgf)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int A[]=new int[t];
        l=0;
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            if(n==1)
            {
                k=scan.nextInt();
                A[l]=k;
                l++;
            }
            if(n==2)
            {
                k=scan.nextInt();
                int p=0;
                for(int y=0;y<l;y++)
                {
                    if(A[y]==k)
                    {
                        A[y]=0;
                        p=1;
                        break;
                    }
                }
                if(p==0)
                {
                    System.out.println("-1");
                }
            }
            int q=0;
            if(n==3)
            {
                for(int a=0;a<l;a++)
                {
                    for(int b=0;b<l;b++)
                    {
                        if(A[a]>A[b])
                        {
                            q=A[b];
                            A[b]=A[a];
                            A[a]=q;
                        }
                    }
                }
                System.out.println(A[0]);
            }
            if(n==4)
            {
                for(int a=0;a<l;a++)
                {
                    for(int b=0;b<l;b++)
                    {
                        if(A[a]>A[b])
                        {
                            q=A[b];
                            A[b]=A[a];
                            A[a]=q;
                        }
                    }
                }
                System.out.println(A[l-1]);
            }
        }
    }
}