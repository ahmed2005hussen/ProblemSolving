package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionEqualSubsetSum {

    /*
   Authour: Ahmed Hussein
   Judge: LeetCode
   Link: https://leetcode.com/problems/partition-equal-subset-sum/description/
*/

    Boolean[][] memo;
    int total = 0;
    public boolean canPartition(int[] nums) {

        for (int x : nums) total += x;
        if(total % 2 != 0) return false;

        memo = new Boolean[nums.length][total + 1];
        return solve(nums, 0, 0, 0);
    }

    public boolean solve(int[] nums, int sum1, int sum2, int i) {
        if (i == nums.length) {
            return sum1 == sum2;
        }
        if(memo[i][sum1]!= null) {
            return memo[i][sum1];
        }
        boolean result = solve(nums, sum1 + nums[i], sum2, i + 1)
                || solve(nums, sum1, sum2 + nums[i], i + 1);
        memo[i][sum1] = result;

        return result;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(new PartitionEqualSubsetSum().canPartition(nums));
    }

}
