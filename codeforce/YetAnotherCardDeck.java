package codeforce;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class YetAnotherCardDeck {
        /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link:https://codeforces.com/problemset/problem/1511/C
        Date: 23/01/2026
     */

    public static void main(String[] argus) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 51; i++) {
            a.add(-1);
        }

        int x;
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();

            if (a.get(x) == -1) {
                a.set(x, i);
            }
        }

        while (q-- != 0) {
            x = sc.nextInt();
            System.out.print(a.get(x) + " ");

            for (int i = 1; i <= 50; i++) {
                if (a.get(i) != -1 && a.get(i) < a.get(x)) {
                    a.set(i, a.get(i) + 1);
                }
            }
            a.set(x, 1);
        }
    }
}
