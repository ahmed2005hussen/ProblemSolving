package codeforce;

import java.util.Scanner;

public class RegularBracketSequence2 {
      /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link: https://codeforces.com/problemset/problem/1469/A
        Date: 25/01/2026
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(s.length() %2 == 0 && s.charAt(0) != ')' && s.charAt(s.length()-1) != '('){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
