class Solution{

	List<Integer> result = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root){
		inorderTraversal_recursive(root);
		return result;
	}  

	void inorderTraversal_recursive(TreeNode ptr){
		if (ptr==null){
			return;
		}

		inorderTraversal_recursive(ptr.left);
		result.add(ptr.val);
		inorderTraversal_recursive(ptr.right);
	}	
}
