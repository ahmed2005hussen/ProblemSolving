package codeforce;

import java.util.Scanner;

public class CalculatingFunction {
            /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link: https://codeforces.com/problemset/problem/486/A
        Date: 22/01/2026
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n % 2 == 0) {
            System.out.println(n/2);
        } else {
            System.out.println(-(n + 1) / 2);
        }
    }
}
