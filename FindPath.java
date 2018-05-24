package offer;

import java.util.ArrayList;

public class FindPath {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)
            return result;
        target -= root.val;
        list.add(root.val);
        if(root.left == null && root.right == null && target == 0){
            result.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size() - 1);
        return result;
    }
}
