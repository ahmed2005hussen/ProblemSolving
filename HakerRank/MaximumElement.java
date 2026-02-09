package HakerRank;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
       /*
        Authour: Ahmed Hussein
        Judge: HakerRank
        Link: https://www.hackerrank.com/challenges/maximum-element/problem
     */

    static class pair {
        public long first;
        public long second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<pair> stack = new Stack<>();

        while (n-- > 0) {
            int x = sc.nextInt();
            if(x==1){
                long q =  sc.nextLong();

                if(stack.isEmpty() || stack.peek().second < q){
                    stack.push(new pair(q, q));
                }
                else{
                    stack.push(new pair(q , stack.peek().second));
                }
            }
            else if(x==2){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(x==3){
                if(!stack.isEmpty()){
                    System.out.println(stack.peek().second);
                }
            }
        }

    }
}
