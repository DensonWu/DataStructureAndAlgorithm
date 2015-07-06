public class SymmetricTree {
	
	public static void main(String[] args)
	{
		System.out.println("Hello");
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
			
		else 
			return isSymmetric(TreeNode root.left, TreeNode root.right);
	}
	
	public boolean isSymmetricRecursive(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		if (left == null || right == null)
			return fasle;
		else
		{
			return (left.val == right.val)
					&& isSymmetricRecursive(left.left, right.right)
					&& isSymmetricRecursive(left.right, right.left);
		}
	}
	
	public boolean isSymmetricIteration(TreeNode left, TreeNode right) {
		
	}
}