import java.util.Scanner;
class code6
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int n=scan.nextInt();
        int A[]=new int[t];
        int B[]=new int[t];
        for(i=0;i<t;i++)
        {
            A[i]=scan.nextInt();
            B[i]=scan.nextInt();
        }
        int a=0;
        int b=0;
        int y=0;
        for(j=0;j<A[t-1]-1;j++)
        {
            int m=0;
            int p=0;
            if(j==A[y+1])
            {
                y++;
            }
            for(k=y;k<t-1;k++)
            {
                for(l=A[k];l<A[k+1];l++)
                {
                    p=p+B[k];
                    m++;
                    if(p>=n)
                    {
                        break;
                    }
                }
                if(p>=n)
                {
                    break;
                }
            }
            while(p<n)
            {   
                m++;
                p=p+B[t-1];
            }
            if(j==0)
            {
                a=m;
                b=j;
            }
            else
            {
                if(a>m)
                {
                    a=m;
                    b=j;
                }
            }
        }
        System.out.println(a+"/"+b);
    }
}