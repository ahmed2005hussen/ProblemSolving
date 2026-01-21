package codeforce;

import java.util.Scanner;

public class StonesOnTheTable {

    /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link: https://codeforces.com/contest/266/problem/A
        Date: 22/01/2026
     */

    public static void main(String[] argus){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        String c = sc.next();
        char last = ' ';
        for (int i = 0; i < n; i++) {
            char x = c.charAt(i);

            if (last == ' ') {
                last = x;
                continue;
            }

            if (last == x) {
                res++;
                continue;
            }
            last = x;

        }

        System.out.println(res);

    }
}
