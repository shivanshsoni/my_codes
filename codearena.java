import java.util.Scanner;
class codearena
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int n=scan.nextInt();
        int A[][]=new int[t][n];
        for(i=0;i<t;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=scan.nextInt();
            }
        }
        int q=scan.nextInt();
        for(k=0;k<q;k++)
        {
            l=scan.nextInt();
            for(i=0;i<t;i++)
            {
                int p=0;
                for(j=0;j<n;j++)
                {
                    if(l==A[i][j])
                    {
                        System.out.println(i+" "+j);
                        p=1;
                        break;
                    }
                }
                if(p==1)
                {
                    break;
                }
            }
        }
    }
}