package Atcoder;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Cylinder {

        /*
    Authour: Ahmed Hussein
    Judge: atcoder
    Link: https://atcoder.jp/contests/abc247/tasks/abc247_d?lang=en
    */
    public static class pair {
        long first;
        long second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        Deque<pair> a = new ArrayDeque<>();

        while (t-- > 0) {
            int x = sc.nextInt();

            if (x == 1) {
                long y = sc.nextLong();
                long z = sc.nextLong();

                a.addLast(new pair(y, z));
            } else {
                long y = sc.nextLong();
                long sum = 0;

                while (y > 0 && !a.isEmpty()) {
                    if (a.peekFirst().second <= y) {
                        sum += a.peekFirst().first * a.peekFirst().second;
                        y -= a.peekFirst().second;
                        a.pollFirst();
                    } else {
                        sum += a.peekFirst().first * y;
                        a.peekFirst().second -= y;
                        y = 0;
                    }
                }

                System.out.println(sum);
            }
        }


    }
}
