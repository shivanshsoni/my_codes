import java.util.Scanner;
class graph
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int n=scan.nextInt();
        boolean A[][]=new boolean[t][t];
        for(j=0;j<t;j++)
        {
            for(k=0;k<t;k++)
            {
                A[j][k]=false;
            }
        }
        for(i=0;i<n;i++)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            A[a-1][b-1]=true;
            A[b-1][a-1]=true;
        }
        l=scan.nextInt();
        for(int x=0;x<l;x++)
        {
            int c=scan.nextInt();
            int d=scan.nextInt();
            if(A[c-1][d-1]==true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}