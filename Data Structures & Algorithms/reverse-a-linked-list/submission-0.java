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
    public ListNode solve(ListNode prev, ListNode cur, ListNode next){
        cur.next = prev;
        if(next == null){
            return cur;
        }
        return solve(cur,next,next.next);
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode cur = head.next;
        head.next = null;
        return solve(head,cur,cur.next);
    }
}
