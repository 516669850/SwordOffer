package offer;

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null)
            return null;
        if(k < 0)
            throw new RuntimeException("输入非法");
        int length = 0;
        ListNode cur = head;
        ListNode result = head;
        while(cur != null){
            length++;
            cur = cur.next;
        }
        if(k > length)
            return null;
        for(int i = 0; i < length - k; i++){
            result = result.next;
        }
        return result;
    }
}
