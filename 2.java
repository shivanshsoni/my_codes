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
            l=scan.nextInt();
            if(l>A[t-1])
            {
                m=0;
            }
            else
            {
                for(int y=t-1;y>=0;y--) 
                {
                    if(A[y]<l)
                    {
                        break;
                    }
                    if(A[y]%l==0)
                    {
                        m++;
                    }
                   
                }
            }
            System.out.println(m);
        }
    }
}