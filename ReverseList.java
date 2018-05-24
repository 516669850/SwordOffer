package offer;

public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode result = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
}
