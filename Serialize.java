package offer;

public class Serialize {
    int index = -1;
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if(root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        return deseCore(str.split(","));
    }
    TreeNode deseCore(String[] str){
        index++;
        if(index >= str.length)
            return null;
        TreeNode node = null;
        if(!str[index].equals("#")){
            node = new TreeNode(Integer.parseInt(str[index]));
            node.left = deseCore(str);
            node.right = deseCore(str);
        }
        return node;
    }
}
