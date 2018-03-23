import java.util.BitSet;
import java.util.Scanner;
 class graph13 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BitSet bs[] = new BitSet[n];
        for (int i = 0; i < n; i++) {
            bs[i] = new BitSet();
            for (int j = 0; j < n; j++) {
                if (sc.nextInt() == 1) {
                    bs[i].set(j);
                }
              //  System.out.println(bs[i]);
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BitSet temp = (BitSet) bs[i].clone();
                BitSet temp1 = (BitSet) bs[j].clone();
                System.out.println(temp);
                System.out.println(temp1);
                temp.and(temp1);
                //System.out.println(temp);
                int k = temp.cardinality();
                System.out.println(k);
                sum += (k * (k - 1) / 2);
            }
        }
 
        System.out.println(sum / 2);    
    }
}