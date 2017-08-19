/**
 * Created by cuibowu on 2017/8/19.
 */

import java.util.StringTokenizer;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder serialized = new StringBuilder();
        serializer(root,serialized);
        return serialized.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        StringTokenizer st = new StringTokenizer(data);
        return deserializer(st);

    }

    private void serializer(TreeNode root, StringBuilder serialized){
        if(root!=null){
            serialized.append(root.val);
            serialized.append(" ");
            serializer(root.left,serialized);
            serializer(root.right,serialized);
        }
        else
            serialized.append("$ ");
    }

    private TreeNode deserializer(StringTokenizer st){
        String val = st.nextToken();
        if(val=="$")
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left=deserializer(st);
        root.right=deserializer(st);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
