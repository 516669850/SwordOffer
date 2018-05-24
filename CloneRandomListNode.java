package offer;

public class CloneRandomListNode {
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead == null)
            return null;
        RandomListNode curr = pHead;
        while(curr != null){
            RandomListNode node = new RandomListNode(curr.label);
            node.next = curr.next;
            curr.next = node;
            curr = node.next;
        }
        curr = pHead;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        RandomListNode result = pHead.next;
        RandomListNode temp = null;
        curr = pHead;
        while(curr.next != null){
            temp = curr.next;
            curr.next = temp.next;
            curr = temp;
        }
        return result;
    }
}
