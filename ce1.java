import java.util.Scanner;
class ce1
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            String str=scan.next();
            j=str.length();
            char A[]=str.toCharArray();
            int m=0;
            for(int a=0;a<j;a++)
            {
                if(A[a]==A[0])
                {
                    m++;
                }
                else
                {
                    break;
                }
            }
            System.out.println(m);
            int y=0;
            for(k=0;k<=j/m;k++)
            {
                int p=0;
                for(l=m*k;l<j;l++)
                {
                    if(A[m*k]==A[l])
                    {
                        p++;
                    }
                }
                if(p==m)
                {
                    y++;
                }
            }
            System.out.println(y);
            if(y*m==j)
            {
                System.out.println("OK");
            }
            else
            {
                System.out.println("Not OK");
            }
        }
    }
}