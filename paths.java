import java.util.Scanner;
class paths
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int a1=scan.nextInt();
            int b1=scan.nextInt();
            int a2=scan.nextInt();
            int b2=scan.nextInt();
            int p=scan.nextInt();
            if(a1==a2||b1==b2)
            {
                System.out.println(p*p);
            }
            else
            {
                int h=1;
                int a=1;
                int b=1;
                for(l=1;l<=a2;l++)
                {
                    a=a*l;
                }
                for(int cl=1;cl<=b2;cl++)
                {
                    b=b*cl;
                }
                for(k=1;k<=a2+b2;k++)
                {
                    h=h*k;
                }
                System.out.println(h/(a*b));
                
            }
        }
    }
}