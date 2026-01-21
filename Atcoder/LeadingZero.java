package Atcoder;

import java.util.Scanner;

public class LeadingZero {
    /*
        Authour: Ahmed Hussein
        Judge: atcoder
        Link: https://atcoder.jp/contests/abc198/tasks/abc198_b?lang=en
        Date: 20/01/2026
     */

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean flag = true;
        int l =0 , r = s.length()-1;
        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
                if(s.charAt(l)!=0){
                    flag = false;
                }
            }
            else if(s.charAt(r)=='0' && flag){
                r--;
            }
            else{
                System.out.println("No");
                return;
            }

        }
        System.out.println("Yes");


    }
}
