class Solution {
	
	TreeNode pres = null;

	public void flatten(TreeNode root) {
		if (root==null){
			return ;
		}

		TreeNode left = root.left;
		TreeNode right = root.right;

		root.left = null;
		root.right = null;	
		pres = root;

		flatten_recursive(left);
		flatten_recursive(right);
	}

	void flatten_recursive(TreeNode root){
		if (root==null){
			return ;
		}	
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		root.left = null;
		root.right = null;
		pres.right = root;
		pres = root;
		
		flatten_recursive(left);
		flatten_recursive(right);
		
	}
}
