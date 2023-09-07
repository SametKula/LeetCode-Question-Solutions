/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left < 0) return null;
        left--;
        right--;
        var ar = new ArrayList<Integer>();

        ListNode cur = head;

        while (cur != null){
            ar.add(cur.val);
            cur =cur.next;
        }
        ListNode result = new ListNode();
        ListNode dummy = new ListNode();
        result.next = dummy;
        for (int i = 0, j = right - left ; i < ar.size(); i++){
            if(i >= left && i <= right) {
                dummy.val = ar.get(i + j);
                j-= 2;
            }
            else {
                dummy.val = ar.get(i);
            }
            if (i == ar.size() - 1) break;

            dummy.next = new ListNode();
            dummy = dummy.next;
        }        
        return result.next;
    }
}