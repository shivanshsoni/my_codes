import java.util.Scanner;
class floor
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int a,b,t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            a=scan.nextInt();
            b=scan.nextInt();
            double c=scan.nextDouble();
            double radians = Math.toRadians(c);
            double e=Math.tan(radians);
            e=e*0.5*a;
            //System.out.println(b-e);
            e=Math.ceil(b-e);
           // System.out.println(e);
            k=(int)e;
            System.out.println(k);
        }
    }
}