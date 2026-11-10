public class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode ptr = head;
		ListNode fast_ptr = head;
		while (fast_ptr!=null){
			if (fast_ptr.next==null){
				break;
			}
			fast_ptr = fast_ptr.next.next;
			ptr = ptr.next;
		}
		return ptr;
	}
}
