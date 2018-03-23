import java.util.Scanner;
class code20
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            Double a=scan.nextDouble();
            Double b=scan.nextDouble();
            Double c=scan.nextDouble();
            Double r=a*b*c*a*b*c/((a+b+c)*(a+b-c)*(b+c-a)*(a+c-b));
            r=3.1415*r;
            String str=Double.toString(r);
            char A[]=str.toCharArray();
            for(j=0;j<str.length();j++)
            {
                if(A[j]==".")
                {
                    break;
                }
                else
                {
                    k++;
                }
            }
            System.out.println(String.format("%.(4+k)g",(3.1415*r)));
        }
    }
}