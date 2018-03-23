import java.util.Scanner;
/**
 * Calculates the nth prime number
 * @author {Zyst}
 */
public class primenumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, 
            i = 2, 
            x = 2;

        System.out.printf("This program calculates the nth Prime number\n");
        System.out.printf("Please enter the nth prime number you want to find: ");
        n = input.nextInt();


        for(i = 2 ;; i++) 
        {
            int p=0;
            for(x = 2; x*x< i; x++) 
            {
                if(i % x == 0) 
                {
                    p=1;
                    break;
                }
            }
            if(p==0) {
                System.out.printf("\n%d is prime", x);
            }
        }
    }
}