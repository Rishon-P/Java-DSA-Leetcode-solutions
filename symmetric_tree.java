class Solution {
	public boolean isSymmetric(TreeNode root) {
		boolean answer = isSymmetric_recursive(root.left, root.right);
		return answer;
	}

	boolean isSymmetric_recursive(TreeNode p, TreeNode q){
		if (p==null && q==null){
			return true;
		} else if (p==null || q==null){
			return false;
		}

		if (p.val==q.val){
			return isSymmetric_recursive(p.left, q.right) && isSymmetric_recursive(p.right, q.left);
		} else {
			return false;
		}
	}
}
