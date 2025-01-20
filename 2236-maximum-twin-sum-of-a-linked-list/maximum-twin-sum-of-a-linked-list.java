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
    public int pairSum(ListNode head) {
        ListNode curr = head;
        Stack<Integer> stack = new Stack<>();
        while(curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }
         curr = head;
         int maxSum = 0;
         int count = 1;
         int size = stack.size();
         while(count <= size/2){
            maxSum = Math.max(maxSum , curr.val+stack.peek());
            curr = curr.next;
            stack.pop();
            count++;
         }
         return maxSum;
    }
}