import java.util.Scanner;
class shlok
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int m=scan.nextInt();
            n=n-1;
            j=0;
            l=0;
            int p=0;
            while(n>l)
            {
                if(j<m)
                {
                    p++;
                    j++;
                    l=l+j;
                }
                else
                {
                    p++;
                    j=m;
                    l=l+j;
                }
            }
            System.out.println(p+1);
        }
    }
}