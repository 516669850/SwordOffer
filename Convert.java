package offer;

public class Convert {
    private TreeNode head = null;
    private TreeNode realHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        convertCore(pRootOfTree);
        return realHead;
    }
    private void convertCore(TreeNode pRootOfTree){
        if(pRootOfTree == null)
            return;
        convertCore(pRootOfTree.left);
        if(head == null){
            head = pRootOfTree;
            realHead = pRootOfTree;
        }else{
            pRootOfTree.left = head;
            head.right = pRootOfTree;
            head = pRootOfTree;
        }
        convertCore(pRootOfTree.right);
    }
}
