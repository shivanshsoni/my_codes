import java.util.Scanner;
class code8
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            k=scan.nextInt();
            int h=scan.nextInt();
            l=k;
            int p=0;
            for(j=0;j<h;j++)
            {
                l=l*k;
            }
            System.out.println(l);
            int y=(l-1)/(k-1);
            System.out.println(y);
            while(y!=0)
            {
                p=p+y%10;
                y=y/10;
            }
            System.out.println(p);
        }
    }
}