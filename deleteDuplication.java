package offer;

public class deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        ListNode first = new ListNode(-1);
        first.next = pHead;
        ListNode last = first;
        ListNode cur = pHead;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                int curVal = cur.val;
                while(cur != null && cur.val == curVal){
                    cur = cur.next;
                }
                last.next = cur;
            }else{
                last = cur;
                cur = cur.next;
            }
        }
        return first.next;
    }
}
