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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        while(temp.next != null){
            ListNode l1 = temp;
            ListNode l2 = temp.next;
            temp = temp.next;
            insert(l1, l2, gcd(l1.val, l2.val));
        }

        return head;
    }

    int gcd(int a, int b){
        for(int i = Math.max(a,b); i>=1; i--){
            if(a % i == 0 && b % i == 0) return i;
        }

        return -1;
    }

    void insert(ListNode l1, ListNode l2, int value){
        ListNode newNode = new ListNode(value);
        newNode.next = l2;
        l1.next = newNode;
    }
}
