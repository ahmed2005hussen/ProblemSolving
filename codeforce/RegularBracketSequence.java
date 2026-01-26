package codeforce;

import java.util.Scanner;
import java.util.Stack;

public class RegularBracketSequence {
        /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link: https://codeforces.com/problemset/problem/26/B
        Date: 25/01/2026
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            String s = sc.next();
            Stack<Character> sq = new Stack<Character>();
            int count =0 ;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    sq.push(s.charAt(i));
                } else {
                    if (!sq.empty()) {
                        count += 2;
                        sq.pop();
                    }
                }
            }

            System.out.println(count);
        }


}
