package Atcoder;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PushPush {

/*
   Authour: Ahmed Hussein
   Judge: atcoder
   Link:  https://atcoder.jp/contests/abc066/tasks/arc077_a?lang=en
*/

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayDeque<Long> deque = new ArrayDeque<>();

        boolean isReversed = (n % 2 == 0) ? true : false;

        Long x;
        for (int i = 0; i < n; i++) {
            if (isReversed) {
                x = sc.nextLong();
                deque.addLast(x);
                isReversed = !isReversed;
            } else {
                x = sc.nextLong();
                deque.addFirst(x);
                isReversed = !isReversed;
            }

        }

        for (Long i : deque) {
            System.out.print(i + " ");
        }
    }


}
