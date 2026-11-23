class BSTIterator {

	TreeNode root = null;
	List<Integer> inorder = new ArrayList<>();
	int i=0;

	public BSTIterator(TreeNode root){
		this.root = root;
		recursive_inorder(this.root);
	}
	
	public void recursive_inorder(TreeNode root){
		if (root==null){
			return;
		}
		recursive_inorder(root.left);
		this.inorder.add(root.val);
		recursive_inorder(root.right);
	}
	
	public boolean hasNext(){
		if (i<this.inorder.size()){
			return true;
		}
		return false;
	}

	public int next(){
		this.i++;
		return this.inorder.get(this.i-1);
	}

	
	
	
}
