package LeetcodePatterns.DFS;

import java.util.*;

public class LevelOrderTraversal {

    private Map<Integer, List<Integer>> addToList(TreeNode root, HashMap<Integer, List<Integer>> retValue, int level){
        int value = root != null ? root.val : null;
        if(retValue.get(level)== null){
            List<Integer> curr = new ArrayList<>();
            curr.add(value);
            retValue.put(level, curr);
        }else{
            List<Integer> curr= retValue.get(level);
            curr.add(value);
            retValue.put(level, curr);
        }
        addToList(root.left, retValue, level+1);
        addToList(root.right, retValue, level+1);
        return retValue;

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return Collections.emptyList();
        Map<Integer, List<Integer>> finalMap = addToList(root, new HashMap<Integer, List<Integer>>(), 0);
        List<List<Integer>> retValue = new ArrayList<List<Integer>>();
        for(int i=0; i<finalMap.size();i++){
            retValue.add(finalMap.get(i));
        }
        return retValue;

    }
}

/**
 * Definition for a binary tree node. */
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

