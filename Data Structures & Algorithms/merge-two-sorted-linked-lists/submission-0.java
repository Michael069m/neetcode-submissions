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
    public ListNode ans = new ListNode(-1);
    public ListNode cur = ans;
    public void solve(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return;
        }
        if(list1 == null ){
            cur.next = list2;
            return;
        }
        if(list2 == null){
            cur.next = list1;
            return;
        }
        if(list1.val < list2.val){
            cur.next = list1;
            cur = list1;
            solve(list1.next,list2);
            return;
        }
        else{
            cur.next = list2;
            cur = list2;
            solve(list1,list2.next);
            return;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        solve(list1,list2);
        return ans.next;
    }
}