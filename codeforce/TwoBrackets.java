package codeforce;

import java.util.Scanner;
import java.util.Stack;

public class TwoBrackets {
           /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link:https://codeforces.com/problemset/problem/1452/C
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){

            String s =  sc.next();
            Stack<Character> a = new Stack<>();
            Stack<Character> b = new Stack<>();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' ||s.charAt(i)  == '[') {
                    if(s.charAt(i)  == '(') a.push(s.charAt(i) );
                    else b.push(s.charAt(i) );
                } else {
                    if (!b.empty() &&s.charAt(i)  == ']' && b.peek() == '[') {
                        b.pop();
                        res++;
                    } else if (!a.empty() && s.charAt(i)  == ')' && a.peek() == '(') {
                        a.pop();
                        res++;
                    }

                }
            }
            System.out.println(res);
        }
    }
}
