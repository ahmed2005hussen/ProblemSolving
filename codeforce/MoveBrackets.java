package codeforce;

import java.util.Scanner;

public class MoveBrackets {
           /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link: https://codeforces.com/problemset/problem/1374/C
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();

            String s =  sc.next();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    res++;
                } else {
                    if (res != 0) {
                        res--;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
