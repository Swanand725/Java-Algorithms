/*Problem : 
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in 
reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */


// Definition for singly-linked list.
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 //Solution answer
class Solution {

    /*
     * Adds the two numbers in the linked list as descriped int he problem discription. 
     * @param l1 - the first linked list
     * @param l2 - the second linked list
     * @result - the linked list with the addition of the two parameters. 
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode(0); 
        ListNode current = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1;
            int val2;
            if (l1 != null) 
            {
                val1 = l1.val;
            } 
            else 
            {
                val1 = 0;
            }
            if (l2 != null)
            {
                val2 = l2.val; 
            }
            else 
            {
                val2 = 0; 
            }

            int total = val1 + val2 + carry;
            carry = total / 10;

            current.next = new ListNode(total % 10);
            current = current.next;
            if (l1 != null) 
            {
                l1 = l1.next;
            }
            if (l2 != null) 
            {
                l2 = l2.next;
            }
        }

        return result.next; 
    }
}