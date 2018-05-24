package offer;

import java.io.Serializable;
import java.util.HashMap;
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null || pHead.next.next == null){
            return null;
        }
        ListNode slowNode = pHead.next;
        ListNode fastNode = pHead.next.next;
        while(slowNode != fastNode){
            if(fastNode.next != null && slowNode.next != null){
                slowNode = slowNode.next;
                fastNode = fastNode.next.next;
            }else{
                return null;
            }
        }
        fastNode = pHead;
        while (fastNode != slowNode){
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}
