import java.util.Scanner;
import java.util.*;
class MArrays {

    public static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double avg(double[] arr) {
        double sum = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
        }
        return sum / length;
    }

    public static int[] copy(int[] arr) {
        int[] anotherArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            anotherArr[i] = arr[i];
        }
        return anotherArr;
    }


    public static int[] reverse(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = tmp;
        }
        return arr;
    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int length = a.length;
        int[][] c = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}