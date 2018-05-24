package offer;

import java.util.ArrayList;

public class KthNode {
    ArrayList<TreeNode> list = new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k){
        add(pRoot);
        if(k <= 0)
            return null;
        if(k > list.size())
            return null;
        return list.get(k - 1);
    }

    public void add(TreeNode pRoot){
        if(pRoot == null)
            return;
        add(pRoot.left);
        list.add(pRoot);
        add(pRoot.right);
    }
}
