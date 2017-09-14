public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        //move fast for n + 1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        //move both pointers simultaneously
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveNthFromEnd rnf = new RemoveNthFromEnd();
        ListNode l1 = ListNode.array2List(new int[]{1, 2, 3, 4, 5});
        ListNode l1Removed = rnf.removeNthFromEnd(l1, 2);
        ListNode.printList(l1Removed);

        ListNode l2 = ListNode.array2List(new int[]{1});
        ListNode l2Removed = rnf.removeNthFromEnd(l2, 1);
        ListNode.printList(l2Removed);
    }
}
