package LeetCode;

import java.lang.classfile.attribute.InnerClassesAttribute;
import java.util.Stack;

public class ReverseInteger {
          /*
        Authour: Ahmed Hussein
        Judge: LeetCode
        Link: https://leetcode.com/problems/reverse-integer/description/?envType=problem-list-v2&envId=vnwjj2jj
     */

    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            if (res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = res * 10 + x % 10;

            x /= 10;
        }

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) res;
    }
}
