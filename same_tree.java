class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean answer = isSameTree_recursive(p, q);	
		return answer;
	}
	
	boolean isSameTree_recursive(TreeNode p, TreeNode q){
		if (p==null && q==null){
			return true;
		} else if (p==null || q==null){
			return false;
		}

		if (p.val == q.val){
			return isSameTree_recursive(p.left, q.left) && isSameTree_recursive(p.right, q.right);
		} else {
			return false;
		}
	}
}
