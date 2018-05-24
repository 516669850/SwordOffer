package offer;

public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null)
            return true;
        return isSy(pRoot.left,pRoot.right);
    }
    public boolean isSy(TreeNode left,TreeNode right){
        if(left == null)
            return right == null;
        if(right == null)
            return false;
        if(left.val != right.val)
            return false;
        return isSy(left.left,right.right) && isSy(left.right,right.left);
    }
}
