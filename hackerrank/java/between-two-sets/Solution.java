import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // https://www.hackerrank.com/challenges/between-two-sets/problem

    static int max(int[] a, int [] b) {
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > temp) temp = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] > temp) temp = b[i];
        }
        return temp;
    }

    static int min(int[] a, int [] b) {
        int temp = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < temp) temp = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] < temp) temp = b[i];
        }
        return temp;
    }

    static int getTotalX(int[] a, int[] b) {

        int temp = 0;
        int min = min(a, b);
        int max = max(a, b);

        outerloop:
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < a.length; j++) {
                if ( i % a[j] != 0) continue outerloop;
            }

            for (int j = 0; j < b.length; j++) {
                if (b[j] % i != 0) continue outerloop;
            }
            // System.out.println("Value: " + i);
            temp++;
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
