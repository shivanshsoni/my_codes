import java.util.Scanner;
class primespoj
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int n,i,j,k,l;
        n=scan.nextInt();
        for(k=0;k<n;k++)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            int m=0;
            if(a<2)
            {
                a=2;
            }
            for(j=a;j<=b;j++)
            {
                int p=0;
                for(i=2;i*i<=j;i++)
                {
                    if(j%i==0)
                    {
                        p=1;
                        break;
                    }
                }   
                if(p==0)
                {
                    System.out.println(j);
                }
            }
            System.out.println("");
        }
    }
}