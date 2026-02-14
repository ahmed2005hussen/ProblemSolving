package UVA;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrinterQueue {

                   /*
   Authour: Ahmed Hussein
   Judge: UVA
   Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3252
*/

    public static class Pair {
        int first;
        int second;

        Pair(int first, int index) {
            this.first = first;
            this.second = index;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        LinkedList<Integer> priorities = null;
        Queue<Pair> q = null;
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            q = new LinkedList<>();
            priorities = new LinkedList<>();

            int x;
            for (int i = 0; i < n; i++) {
                x = sc.nextInt();
                Pair p = new Pair(x, i);
                q.add(p);
                priorities.add(x);
            }

            priorities.sort(Collections.reverseOrder());

            int time = 0;
            int idx = 0;

            while (!q.isEmpty()) {
                Pair current = q.peek();
                q.poll();
                if (current.first == priorities.get(idx)) {
                    time++;
                    idx++;

                    if (current.second == m) {
                        System.out.println(time);
                        break;
                    }
                } else {
                    q.add(current);
                }

            }

        }
    }



}
