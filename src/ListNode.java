import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static ListNode array2List(int[] array) {
        if (array.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode iter = dummy;
        for (int val : array) {
            iter.next = new ListNode(val);
            iter = iter.next;
        }
        return dummy.next;
    }
}
