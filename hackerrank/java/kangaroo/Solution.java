import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/kangaroo/problem

    static String kangaroo(int x1, int v1, int x2, int v2) {

        // Different pace
        if (((x1 < x2) && (v1 < v2)) || ((x1 > x2) && (v1 > v2))) return "NO";

        // Even or uneven
        if ((x1 % 2 == 0) && (x2 % 2 == 1) && (v1 % 2 == 0) && (v2 % 2 == 0)) return "NO";

        if ((x1 % 2 == 1) && (x2 % 2 == 0) && (v1 % 2 == 0) && (v2 % 2 == 0)) return "NO";

        // Brute force
        for(int i=1; i < Integer.MAX_VALUE; i++) {
            if ((x1 + v1*i) == (x2 + v2*i)) {
                return "YES";
            }

            // Detect Overflow in Java 7, Java 8 has specific methods
            long t1 = x1 + v1*i;
            long t2 = x2 + v2*i;

            if (t1 + v1 > Integer.MAX_VALUE) return "NO";
            if (t2 + v2 > Integer.MAX_VALUE) return "NO";
        }
        return "NO";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
