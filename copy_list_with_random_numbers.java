class Solution {
	public Node copyRandomList(Node head) {
		Map<Node, Node> mapped = new HashMap<>();
		if (head ==null){
			return null;
		}
		Node temp, temp2;
		Node ptr = head;
		Node prev = null;
		Node new_head = null;
		boolean is_first = true;
		while (ptr!=null){
			if (mapped.containsKey(ptr)){
				temp = mapped.get(ptr);
			} else {	
				temp = new Node(ptr.val);
				mapped.put(ptr, temp);
			}
			if (is_first){
				new_head = temp;
				is_first = false;
			}
			if (ptr.random!=null){
				if (mapped.containsKey(ptr.random)){
					temp.random = mapped.get(ptr.random);
				} else {
					temp2 = new Node(ptr.random.val);
					temp.random = temp2;
					mapped.put(ptr.random, temp2);
				}
			} else {
				temp.random = null;
			}
			if (prev!=null){
				prev.next = temp;
			}
			prev = temp;
			ptr = ptr.next;
		}
		return new_head; 
	}
}
