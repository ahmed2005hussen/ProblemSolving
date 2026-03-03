package Atcoder;

import java.util.LinkedList;
import java.util.Scanner;

public class LRInsertion {

    /*
        Authour: Ahmed Hussein
        Judge: atcoder
        Link: https://atcoder.jp/contests/abc237/tasks/abc237_d?lang=en
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        LinkedList<Integer> dq = new LinkedList<>();

        dq.addLast(n);

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'L') {
                dq.addLast(i);
            } else {
                dq.addFirst(i);
            }
        }

        for (int i : dq) {
            System.out.print(i + " ");
        }
    }
}
