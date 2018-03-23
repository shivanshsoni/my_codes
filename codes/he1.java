import java.util.Scanner;
class he1
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            String str=scan.next();
            char A[]=str.toCharArray();
            j=str.length();
            int m=0;
            for(k=1;k<j-1;k++)
            {
                if(A[k-1]!=A[k]||A[k]!=A[k+1]||A[k-1]!=A[k+1])
                {
                	m++;
                	k=k+2;
                }
            }
            System.out.println(j-3*m);
        }
    }
}