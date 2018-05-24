package offer;

public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        TreeLinkNode cur = pNode;
        if(cur == null)
            return null;
        if(cur.right != null){
            cur = cur.right;
            while(cur.left != null){
                cur = cur.left;
            }
            return cur;
        }
        while(cur.next != null){
            if(cur.next.left == cur)
                return cur.next;
            cur = cur.next;
        }
        return null;
    }
}
