import java.util.Scanner;
class code9
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int x1=scan.nextInt();
            int y1=scan.nextInt();
            int x2=scan.nextInt();
            int y2=scan.nextInt();
            
            k=scan.nextInt();
            l=0;
            if((x1*y2-y1*x2)>0)
            {
                l=(x1*y2-y1*x2)/2;
            }
            else
            {
                l=(y1*x2-y2*x1)/2;
            }
            j=4*l*l/((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            System.out.println(j);
            if(j==k*k)
            {
                System.out.println("JUST MISSED");
            }
            else if(j>k*k)
            {
                System.out.println("SAFE");
            }
            else
            {
                System.out.println("REPLANNING");
            }
        }
    }
}