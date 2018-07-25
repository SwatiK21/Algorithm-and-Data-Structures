package LeetCode;

/**** Given two binary trees and imagine that 
 * when you put one of them to cover the other, 
 * some nodes of the two trees are overlapped while the others are not.
 * 
 *  Note: The merging process must start from the root nodes of both trees.
 *  ***/


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x){
		val = x;
	}
}

public class MergeTwoBinaryTrees_617 {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null){
			// Both trees are empty
			return null;
		}
		if(t1 == null){
			return t2;
		}
		if(t2 == null){
			return t1;
		}
		
		TreeNode newMergedTree = new TreeNode(t1.val + t2.val);
		newMergedTree.left = mergeTrees(t1.left,t1.right);
		newMergedTree.right = mergeTrees(t2.left,t2.right);
		
		return newMergedTree;
	}
	
}

 