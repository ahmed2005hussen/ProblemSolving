package Atcoder;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Buildings {
    /*
   Authour: Ahmed Hussein
   Judge: atcoder
   Link: https://atcoder.jp/contests/abc372/tasks/abc372_d?lang=en
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add( sc.nextInt());
        }
        ArrayList<Integer> final1 = new ArrayList<>(n);
        Stack<Integer> res = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            final1.add(res.size());

            if (res.empty()) {
                res.push(a.get(i));
            } else if (res.peek() > a.get(i)) {
                res.push(a.get(i));
            } else {
                while (!res.empty() && res.peek() < a.get(i)) {
                    res.pop();
                }
                res.push(a.get(i));
            }
        }

        for (int i = final1.size() - 1; i >= 0; i--) {

            System.out.print(final1.get(i) + " ");
        }
    }
}
