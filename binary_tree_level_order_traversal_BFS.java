class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		int no_elem = 1;
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new ArrayDeque<>();
		if (root==null){
			return result;
		}
		queue.add(root);
		int sub = 0;
		while (!queue.isEmpty()){
			List<Integer> sub_list = new ArrayList<>();
			for (int i=0;i<no_elem;i++){
				TreeNode node = queue.remove();
				if (node.left!=null){
					queue.add(node.left);
					sub = sub+1;
				}
				if (node.right!=null){
					queue.add(node.right);
					sub = sub+1;
				}
				sub_list.add(node.val);
			}	
			no_elem = sub;
			sub = 0;
			if (!sub_list.isEmpty()){
				result.add(sub_list);	
			}
		}
		return result;
	}
}
