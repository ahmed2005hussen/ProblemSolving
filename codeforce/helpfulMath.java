package codeforce;

import java.util.Scanner;

public class helpfulMath {

        /*
        Authour: Ahmed Hussein
        Judge: codeforces
        Link: https://codeforces.com/problemset/problem/339/A
        Date: 21/01/2026
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int []arr = new int[4];

        int n =0 ;
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i) =='1'){
                arr[1] +=1;
                n++;
            }
            else if(s.charAt(i)=='2'){
                arr[2] +=1;
                n++;
            }
            else if(s.charAt(i) =='3'){
                arr[3] +=1;
                n++;
            }
        }

        while(true){
            if(arr[1]==0 && arr[2]==0 && arr[3]==0){
                break ;
            }

            if(arr[1]!=0){
                System.out.print("1");
                arr[1]--;
                if(arr[1]!=0 || arr[2]!=0 || arr[3]!=0){
                    System.out.print("+");

                }
                continue;
            }

            if(arr[2]!=0){
                System.out.print("2");

                arr[2]--;
                if(arr[1]!=0 || arr[2]!=0 || arr[3]!=0){
                    System.out.print("+");

                }
                continue;
            }
            if(arr[3]!=0){
                System.out.print("3");
                arr[3]--;
                if(arr[1]!=0 || arr[2]!=0 || arr[3]!=0){
                    System.out.print("+");

                }
            }
        }
    }
}
