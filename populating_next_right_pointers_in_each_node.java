class Solution {
	public Node connect(Node root) {
		Queue<Node> que = new ArrayDeque<>();
		int j = 2;
		if (root==null){
			return root;
		}
		root.next = null;
		if (root.left==null && root.right==null){
			return root;
		}	
		que.add(root.left);
		que.add(root.right);	
		while (!q.isEmpty()){
			Node x = que.poll();
			if (x.left!=null && x.right!=null){
				que.add(x.left);
				que.add(x.right);
			}
			for (int i=1;i<j;i++){
				Node y = que.poll();
				x.next = y;
				if (y.left!=null && y.right!=null){
					que.add(y.left);
					que.add(y.right);
				}
				x = y;
			}
			j = j*2;
		}
		return root;
	}
}
