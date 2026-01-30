package LeetCode;

public class AddTwoNumbers {

        /*
        Authour: Ahmed Hussein
        Judge: LeetCode
        Link: https://leetcode.com/problems/add-two-numbers/description/?envType=problem-list-v2&envId=vnwjj2jj

     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int n = 0;
            ListNode res = new ListNode(0);
            ListNode i = res;

            while (l1 != null || l2 != null || n != 0) {
                int val1 = (l1 != null) ? l1.val : 0;
                int val2 = (l2 != null) ? l2.val : 0;

                int value = val1 + val2 + n;
                n = value / 10;

                value = (value) % 10;


                i.next = new ListNode(value);
                i = i.next;

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;

            }
            return res.next;

        }
    }
}
