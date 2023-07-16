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
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        int k=0;
        HashMap <ListNode,Integer> m=new HashMap<ListNode,Integer>();
        while(!m.containsKey(temp) && temp!=null)
        {
            m.put(temp,k);
            k++;
            temp=temp.next;
        }
        if(temp!=null)
        {
            return temp;
        }
        else
        return null;
    }
}