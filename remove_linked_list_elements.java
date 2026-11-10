public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		if (head==null){
			return null;
		}
		ListNode ptr = head;
		ListNode prev = null;
		while (ptr!=null){
			if (ptr.val==val){
				if (ptr==head){
					ptr = ptr.next;
					head = ptr;
				} else {
					prev.next = ptr.next;
					ptr = ptr.next;			
				} 
			}else {
				prev = ptr;
				ptr = ptr.next; 
			}
		}
		return head;
	}
}	
