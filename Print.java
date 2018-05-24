package offer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(pRoot == null)
            return list;
        int levelNum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);

        while(!queue.isEmpty()){
            levelNum = queue.size();
                ArrayList<Integer> temp = new ArrayList<>();
                while(levelNum > 0){
                    TreeNode node = queue.poll();
                    if(node != null){
                        queue.offer(node.left);
                        queue.offer(node.right);
                        System.out.print(node.val + " ");
                        temp.add(node.val);
                    }
                    levelNum--;
                }
                if(!temp.isEmpty()){
                    System.out.println();
                    list.add(temp);
                }
        }
        return list;
    }
}
