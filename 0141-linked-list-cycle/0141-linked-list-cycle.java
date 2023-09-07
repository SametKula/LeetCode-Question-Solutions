/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode left = head;
        ListNode right = head.next;

        while ( left != right){
            if (right == null || right.next == null){
                System.gc();
                return false;
            } 

            left = left.next;
            right = right.next.next;
        }
        System.gc();
        return true;
    }
}