package offer;

public class reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0)
            return null;
        return reConstructCore(pre,0,pre.length-1,in,0,in.length-1);
    }
    public static TreeNode reConstructCore(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if(startPre > endPre || startIn > endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for(int i = startIn; i <= endIn; i++){
            if(in[i] == pre[startPre]){
                root.left = reConstructCore(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right = reConstructCore(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
                break;
            }
        }
        return root;
    }
}
