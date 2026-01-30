package LeetCode;

import java.util.Scanner;

public class MaximumRepeatingSubstring {

        /*
        Authour: Ahmed Hussein
        Judge: LeetCode
        Link: https://leetcode.com/problems/maximum-repeating-substring/description/?envType=problem-list-v2&envId=vy7pmnih

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequence = sc.nextLine();
        String word = sc.nextLine();

        int n = sequence.length();
        int m = word.length();

        int[] dp = new int[n + 1];
        int count = 0;

        for (int i = m; i <= n; i++) {
            if (sequence.substring(i - m, i).equals(word)) {
                dp[i] = dp[i - m] + 1;
                count = Math.max(count, dp[i]);
            }
        }
        System.out.println(count);

    }
}
