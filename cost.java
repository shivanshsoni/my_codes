import java.util.Scanner;
import java.io.*;
class cost
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
            StringBuilder str=new StringBuilder("");
            for(j=0;j<a;j++)
            {
                String ptr=scan.next();
                char A[]=ptr.toCharArray();
                Arrays.sort(A);
                int m=0;
                for(k=0;k<b-1;k++)
                {
                    if(A[k]==A[k+1])
                    {
                        m=1;
                    }
                }
                if(m==0)
                {
                    str.append("1");
                }
                else
                {
                    str.append("0");
                }
            }
            System.out.println(str.toString());
        }
    }
}