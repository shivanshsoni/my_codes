import java.util.Scanner;
class column
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            int A[][]=new int[a][b];
            for(j=0;j<a;j++)
            {
                for(k=0;k<b;k++)
                {
                    A[j][k]=scan.nextInt();
                }
            }
            int p=0;
            for(l=0;l<b-1;l++)
            {
                int m=0;
                for(int y=0;y<a;y++)
                {
                    if(A[y][l]==A[y][l+1])
                    {
                        m++;
                    }
                }
                if(m==a)
                {
                    p++;
                }
            }
            System.out.println(p);
            if(p==1||p==0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}