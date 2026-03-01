package codeforce;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PermutationMinimizationByDeque {

          /*
   Authour: Ahmed Hussein
   Judge: Codeforces
   Link: https://codeforces.com/problemset/problem/1579/E1
*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();

        while (tc-- > 0) {

            int n = scanner.nextInt();

            LinkedList<Integer> dq = new LinkedList<>();

            int x = scanner.nextInt();

            dq.addLast(x);

            for (int i = 0; i < n - 1; i++) {

                x = scanner.nextInt();

                if (x < dq.peekFirst()) {
                    dq.addFirst(x);
                } else {
                    dq.addLast(x);
                }
            }

            for(int i : dq){
                System.out.print(i + " ");
            }

            System.out.println();

        }

    }


}
