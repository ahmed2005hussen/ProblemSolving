package LeetCode;

public class MinCostClimbingStairs {
            /*
        Authour: Ahmed Hussein
        Judge: LeetCode
        Link: https://leetcode.com/problems/min-cost-climbing-stairs/description/?envType=problem-list-v2&envId=vy7pmnih

     */

    public static void main(String[]args){
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int[] dp =  new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length ; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        int i =  cost.length;
        dp[i] = Math.min(dp[i-1],dp[i-2]);
        System.out.println(dp[i]);

    }



}
