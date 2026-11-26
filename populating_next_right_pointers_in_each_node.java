// Solution 1 : Beats 40.25% solutions, uses priority queue for storing and modifing the next pointers
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


// Solution 2 : Beats 100% solutions, Iterating through each level directly.  
class Solution {
	public Node connect(Node root){
		Node temp = root;
		Node start  = root;
		if (root==null || root.left==null){
			return root;
		}
		while (true){
			if (start.left==null){
				break;
			}
			temp = start.left;  
			while (start!=null){
				if (start.left!=null){
					start.left.next = start.right;	
				} 
				if (start.next!=null){
					start.right.next = start.next.left;
				} 
				start = start.next;
			}	
			start = temp;
		}
		return root;
	}
}
