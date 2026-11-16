class Solution {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (root==null){
			return false;
		}
		if (isSubRoot(root,subRoot)){
			return true;
		}
		
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) ;
	}

	boolean isSubRoot(TreeNode ptr1, TreeNode ptr2){
		if (ptr1 == null && ptr2 == null){
			return true;
		} else if (ptr1==null || ptr2==null){
			return false;	
		}
		if (ptr1.val!=ptr2.val){
			return false;
		}	
		return isSubRoot(ptr1.left, ptr2.left) && isSubRoot(ptr1.right ,ptr2.right);
	}
}
