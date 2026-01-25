// Last updated: 1/25/2026, 2:30:27 PM

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node to store result
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        // Loop until both lists and carry are finished
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Create new node with digit value
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Update carry
            carry = sum / 10;
        }

        return dummy.next;
    }
}

        
