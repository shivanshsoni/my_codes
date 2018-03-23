class subset_sum
{
   static boolean isSubsetSum(int set[], int n, int sum)
    {
        if (sum == 0)
         return true;
       if (n == 0 && sum != 0)
         return false;
       if (set[n-1] > sum)
        return isSubsetSum(set, n-1, sum);
        return isSubsetSum(set, n-1, sum) || isSubsetSum(set, n-1, sum-set[n-1]);
    }
    public static void main (String args[])
    {
          int set[] = {3, 34, 5, 12, 5, 3};
          int sum = 9;
          int n = set.length;
          if (isSubsetSum(set, n, sum) == true)
             System.out.printf("Found a subset with given sum and %d",n);
          else
             System.out.println("No subset with given sum");
    }
}