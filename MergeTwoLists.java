/*
 Problem: 
 You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 
Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */

public class MergeTwoLists {
     //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /*
     * Solution to the above problem
     * @param list1 - the first list 
     * @param list2 - the second list 
     * @return - the combined list
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode current = result;

        while (list1 != null || list2 != null)
        {
            int val1 = 0; 
            int val2 = 0; 
            if (list1 != null) 
            {
                val1 = list1.val;
            }
            else
            {
                while (list2 != null)
                {
                    current.next = new ListNode(list2.val);
                    current = current.next; 
                    list2 = list2.next;
                }
                return result.next;
            }
            if (list2 != null) 
            {
                val2 = list2.val;
            }
             else
            {
                while (list1 != null)
                {
                    current.next = new ListNode(list1.val);
                    current = current.next; 
                    list1 = list1.next;
                }
                return result.next;
            }
            if (val1 < val2)
            {
                current.next = new ListNode(val1); 
                if (list1 != null) 
                {
                    list1 = list1.next;
                }
            }
            if (val2 < val1)
            {
                current.next = new ListNode(val2); 
                if (list2 != null) 
                {
                    list2 = list2.next;
                }
            }
            if (val1 == val2)
            {
                current.next = new ListNode(val1); 
                current = current.next; 
                current.next = new ListNode(val2); 
                if (list1 != null) 
                {
                    list1 = list1.next;
                }
                if (list2 != null) 
                {
                    list2 = list2.next;
                }
            }
            current = current.next;
        }

        return result.next; 
    }
}
