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
    public ListNode middleNode(ListNode head) {
        ListNode rear = head;

        int numberOfNodes=0;

        while(rear.next!=null){
            rear=rear.next;
            numberOfNodes++;
        }

        int middleNode = 0;

        if(numberOfNodes%2==0)
            middleNode=numberOfNodes/2;
        else
            middleNode=numberOfNodes/2+1;

        while (middleNode>0){
            head=head.next;
            middleNode--;
        }
        return head;
    }
}