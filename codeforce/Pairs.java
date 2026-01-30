package codeforce;

import java.util.ArrayList;
import java.util.Scanner;

public class Pairs {

        /*
   Authour: Ahmed Hussein
   Judge: Codeforces
   Link: https://codeforces.com/problemset/problem/1169/B
*/

  static int n , m;
    static ArrayList<pair> a =  new ArrayList<pair>();
    public static class pair {
        int first;
        int second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static boolean check(int x) {

        ArrayList<Integer> freq = new ArrayList<>();
        int res = 0;
        for (int i = 0; i <= n; i++) {
            freq.add(0);
        }

        for (int i = 0; i < m; i++) {
            if (a.get(i).first != x && a.get(i).second != x) {
                freq.set(a.get(i).first, freq.get(a.get(i).first)+1);
                freq.set(a.get(i).second, freq.get(a.get(i).second)+1);
                res++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (freq.get(i) >= res)return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x , y;
            x = sc.nextInt();
            y = sc.nextInt();
            a.add(new pair(x, y));
        }

        if (check(a.get(0).first) || check(a.get(0).second) ) System.out.println("YES");
        else System.out.println("NO");
    }
}
