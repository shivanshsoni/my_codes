import java.util.Scanner;
class he11
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
            String ptr=scan.next();
            char B[]=ptr.toCharArray();
            char C[]=new char[ptr.length()];
            l=0;
            for(j=0;j<26;j++)
            {
                for(k=0;k<ptr.length();k++)
                {
                    if(B[k]==A[j])
                    {
                        C[l]=B[k];
                        l++;
                    }
                }
            }
            String b=new String(C);
            System.out.println(b);
        }
    }
}