package codeforce;

import java.util.Scanner;

public class ReplacingElement {
    /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link: https://codeforces.com/problemset/problem/1473/A
        Date: 21/01/2026
     */

    public static class pair {
        int first;
        int second;

        pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {


            pair min = new pair(Integer.MAX_VALUE, Integer.MAX_VALUE);

            int n = sc.nextInt();
            int d = sc.nextInt();

            int max = 0;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] < min.first && a[i] < min.second) {

                    if (min.first < min.second) {
                        min.second = a[i];
                    } else {
                        min.first = a[i];
                    }
                } else if (a[i] < min.second) {
                    min.second = a[i];
                } else if (a[i] < min.first) {
                    min.first = a[i];
                }

                if (a[i] > max) {
                    max = a[i];
                }
            }

            if (max <= d || min.first + min.second <= d) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
