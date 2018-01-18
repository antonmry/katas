import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/the-birthday-bar/problem

    static int solve(int n, int[] s, int d, int m) {
        int temp = 0;

        for (int i = 0; i < n - m + 1; i++) {
            int a = 0;
            for (int j = i; j < i + m; j++) {
                a = a + s[j];
            }

            if (a == d) temp++;
            // System.out.println("i: " + (a == d));
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
