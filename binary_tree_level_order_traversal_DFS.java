class Solution {
	List<List<Integer>> result = new ArrayList<>();
	public List<List<Integer>> levelOrder(TreeNode root) {
		result.clear();
		DFS_recursive(root, 0);
		return result;	
	}

	void DFS_recursive(TreeNode node, int level){
		int siz = result.size();
		if (node==null){
			return ;
		}
		if (level==siz){
			List<Integer> sub_list = new ArrayList<>();
			sub_list.add(node.val);
			result.add(sub_list);
				
		} else {
			result.get(level).add(node.val);
		}
		DFS_recursive(node.left, level+1);
		DFS_recursive(node.right, level+1);
	}
}
