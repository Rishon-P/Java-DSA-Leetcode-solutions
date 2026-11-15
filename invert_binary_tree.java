class Solution {
	public TreeNode invertTree(TreeNode root) {
		Queue<TreeNode> queue = new ArrayDeque<>();
		TreeNode ptr = root;
		if (root==null){
			return root;
		}
		queue.add(ptr);
		while (!queue.isEmpty()){
			ptr = queue.poll();
			if (ptr==null){
				continue;	
			}
			TreeNode temp = ptr.left;
			ptr.left = ptr.right;
			ptr.right = temp;
			if (ptr.left!=null){
				queue.add(ptr.left);
			}
			if (ptr.right!=null){
				queue.add(ptr.right);
			}	
		}	
		return root;
	}
}
