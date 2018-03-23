import java.util.Scanner;
import java.util.Arrays;
class shuchi
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
            for(j=0;j<n;j++)
            {
                A[j]=scan.nextInt();
            }
            Arrays.sort(A);
            l=0;
            int p=0;
            int s=0;
            for(l=0;l<n-k;l++)
            {
                int m=0;
                for(int a=l;a<k+l;a++)
                {
                    if(A[a]<A[l])
                    {
                        m=(A[l]-A[a])*3;      
                    }
                    if(A[a]>A[l])
                    {
                        m=(A[a]-A[l])*5;   
                    }
                    if(l==0)
                    {
                        p=m;
                    }
                }
                if(m<=p)
                {
                  s=m;  
                }
            }
            System.out.println(s);
        }
    }
}