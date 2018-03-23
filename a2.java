import java.util.Scanner;
import java.util.Arrays;
class a2
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int A[]=new int[t];
        for(i=0;i<t;i++)
        {
            A[i]=scan.nextInt();
        }
        Arrays.sort(A);
        k=scan.nextInt();
        for(j=0;j<k;j++)
        {
            int m=0;
            int x,y=0;
            l=scan.nextInt();
            if(l>A[t-1])
            {
                System.out.println("0");
            }
            else
            {
                for(int a=0;a<t;a++)
                {
                    if(a>=A[0])
                    {
                        x=a;
                        break;
                    }
                }
                for(int b=t-1;b>=x;b++)
                {
                    if(A[b]%l==0)
                    {
                        y=b;
                        break;
                    }
                }
                for(int c=x;c<=y;c++)
                {
                    if(A[c]%l==0)
                    {
                        m++;
                    }
                }
                System.out.println(m);
            }
        }
    }
}