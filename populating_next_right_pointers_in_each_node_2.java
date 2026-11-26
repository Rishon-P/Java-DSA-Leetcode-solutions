// Solution 2 : Beats 100% solutions, Iterating through each level directly.  
class Solution {
	public Node connect(Node root){
		Node temp = root;
		Node start  = root;
		if (root==null || (root.left==null && root.right==null)){
			return root;
		}
		while (true){
			temp = null;
			if (start==null){
				break;
			}
			boolean left = false, right = false;
			boolean is_first = true;
			while (start!=null){
				left = false; 
				right = false;
				if (start.left!=null){
					left = true;
				}
				if (start.right!=null){
					right = true;
				} 
				if (!left && !right){
					start = start.next;
					continue;
				}
				if (is_first){
					if (left){
						temp = start.left;
					} else if (right){
						temp = start.right;	
					}
					is_first = false;
				}
				Node temp2 = start.next;
				while (temp2!=null){
					if (temp2.left!=null || temp2.right!=null){ 
						break;
					}
					temp2 = temp2.next;
				}
				if (left && right){
					start.left.next = start.right;
					if (temp2!=null){
						if (temp2.left!=null){
							start.right.next = temp2.left;	
						} else if (temp2.right!=null){
							start.right.next = temp2.right;
						} 
					}
				} else {
					if (left){
						if (temp2!=null){
							if (temp2.left!=null){
								start.left.next = temp2.left;
							} else if (temp2.right!=null){
								start.left.next = temp2.right;	
							}
						}
					} else {
						if (temp2!=null){
							if (temp2.left!=null){
								start.right.next = temp2.left;
							} else if (temp2.right!=null){
								start.right.next = temp2.right;	
							}
						}
					}
				}
				start = temp2;
			}	
			start = temp;
		}
		return root;
	}
}
