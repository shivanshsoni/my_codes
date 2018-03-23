import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
public class LCM {

   public static int LCM = 1;

    public static int returnMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != 1 && array[i] < min) {
                min = array[i];
            }
        }
        return min; //When this returns Integer.MAX_VALUE, we are done
    }

    public static int returnFirstDivisor(int val) {
        if (val == Integer.MAX_VALUE) {
            return -1; //Return -1 to signal end
        } else {
            for (int i = 2; i <= val; ++i) {
                if (val % i == 0) {
                    LCM *= i;
                    return i;
                }
            }
        }
        return -10;
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int array[] = new int[n];
        int x;
        for(int y=0;y<n;y++)
        {
            array[y]=scan.nextInt();
            x=x*array[y];
        }
        Double g=Math.pow(x,1/n);
        if(g==int(g))
        {
            System.out.println("justdoit");
        }
        else{
        Arrays.sort(array);
        int p=array[0];
        while (true) {
            int minDivisor = returnFirstDivisor(returnMinValue(array)); 
            if (minDivisor == -1) break; 
            
            for (int i = 0; i < n ;++i) {
                if (array[i] % minDivisor == 0) {
                    array[i] /= minDivisor;
                }
            }
        }
        LCM=LCM/p;
        System.out.println(LCM);
        long r=1L;
        for(int m=0;m<n;m++)
        {
            r=r*LCM;
            //System.out.println(LCM);
        }
        System.out.println(r%1000000007);
        } 
    }
}