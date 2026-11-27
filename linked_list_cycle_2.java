//Solution 1: Using the hash tables 
class Solution {
	public ListNode detectCycle(ListNode head) {
		HashSet<ListNode> hashset = new HashSet<>();
		if (head==null){
			return null;
		}
		ListNode ptr = head;
		while (ptr!=null){
			if (hashset.contains(ptr)){
				return ptr;
			}
			hashset.add(ptr);
			ptr = ptr.next;
		}
		return null;
	}
}

// Solution 2: Better solution using the pointers to the nodes

class Solution {
	public ListNode detectCycle(ListNode head){
		ListNode fast, slow;
		fast = head;
		slow = head;
		do {
			if (fast==null){
				return null;
			}
			if (fast.next!=null){
				fast = fast.next.next;
			} else {
				return null;
			}
			slow = slow.next;	
		} while (fast!=slow);
		fast = head;
		while (fast!=slow){
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}
}
