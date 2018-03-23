import java.util.Scanner;
import java.util.*;
class graph3
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int A[]=new int[n];
            int m=0;
            TreeSet tree=new TreeSet();
            for(j=0;j<n;j++)
            {
                int a=scan.nextInt();
                int b=scan.nextInt();
                boolean res=tree.add(a);
                boolean pes=tree.add(b);
                if(res)
                {
                    m++;
                }
                if(pes);
                {
                    m++;
                }
            }
            System.out.println(m);
        }
    }
}