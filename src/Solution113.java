/**
 * Created by cuibowu on 2017/8/20.
 */

import java.util.LinkedList;
import java.util.List;
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

public class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        List<String> list = new LinkedList<>();
        searchAllPath(root, "", list);
        for(int i=0;i<list.size();i++){
            String path = list.get(i);
            StringTokenizer st = new StringTokenizer(path);
            int sumVal =0;
            List<Integer> temp = new LinkedList<>();
            while (st.hasMoreTokens()){
                int tempInt = Integer.parseInt(st.nextToken());
                temp.add(tempInt);
                sumVal+=tempInt;
            }
            if(sumVal==sum){
                result.add(temp);
            }
        }
        return result;
    }

    private void searchAllPath(TreeNode root, String path, List<String> list) {
        if (root == null)
            return;
        if(root.left==null&&root.right==null){
            list.add(path+root.val);
            return;
        }
        searchAllPath(root.left,path+root.val+" ",list);
        searchAllPath(root.right,path+root.val+" ",list);
    }
}
