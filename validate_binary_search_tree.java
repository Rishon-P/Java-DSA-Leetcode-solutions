class Solution {
	public boolean isValidBST(TreeNode root) {
		TreeNode ptr = root;
		if (ptr==null){
			return false;
		}
		return isValid_recursive(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	boolean isValid_recursive(TreeNode root, long min, long max){
		if (root==null){
			return true;
		}

		if (root.val > min && root.val < max){
			return isValid_recursive(root.left, min, root.val) && isValid_recursive(root.right, root.val, max);
		} else {
			return false;
		}

		
	}
}
