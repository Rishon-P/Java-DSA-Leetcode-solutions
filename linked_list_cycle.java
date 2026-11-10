public class Solution{
	public boolean hasCycle(ListNode head) {
		if (head==null || head.next==null){
			return false;
		}
		ListNode norm_ptr = head;
		ListNode fast_ptr = head;
		while (fast_ptr!=null){
			if (fast_ptr.next==null){
				return false;
			}
			fast_ptr = fast_ptr.next.next;
			norm_ptr = norm_ptr.next;
			if (fast_ptr==norm_ptr){
				return true;
			}
		}
		return false;
	}
}
