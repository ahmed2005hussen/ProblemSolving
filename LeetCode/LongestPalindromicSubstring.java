package LeetCode;

public class LongestPalindromicSubstring {

           /*
   Authour: Ahmed Hussein
   Judge: LeetCode
   Link: https://leetcode.com/problems/longest-palindromic-substring
*/


    static class Solution {
        public String longestPalindrome(String s) {

            if (s.length() < 2) return s;
            int start = 0;
            int end = 0;

            for (int i = 0; i < s.length(); i++) {
                int test1 = isPalindrome(s, i, i);
                int test2 = isPalindrome(s, i, i+1);
                test1 = Math.max(test1, test2);
                if (test1 > end - start) {
                    start = i - (test1 - 1) / 2;
                    end = i + (test1) / 2;
                }
            }

            return s.substring(start, end + 1);

        }

        int isPalindrome(String s, int left, int right) {
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return right - left - 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
    }
}
