package LeetCode;

import java.util.ArrayList;

public class LeafSimilarTrees_872 {
	public boolean leafSimilar(TreeNode root1, TreeNode root2){
		// Two arrayList to store the leaf value sequence
		ArrayList<Integer> arrL1 = new ArrayList<Integer>();
		ArrayList<Integer> arrL2 = new ArrayList<Integer>();
		// call dfs function
		dfs(root1,arrL1);
		dfs(root2,arrL2);
		//To determine the leaf sequence is true or not
		return arrL1.equals(arrL2);
	}
	
	public void dfs(TreeNode node, ArrayList<Integer> list){
		// Node exists
		if(node != null){
			// Leaf node is possible only when it's left and right child 
			// is null
			if(node.left == null && node.right == null){
				list.add(node.val);
			}
			dfs(node.left,list);
			dfs(node.right,list);
		}
	}
}
