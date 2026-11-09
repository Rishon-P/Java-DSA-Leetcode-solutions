class Solution {
	public ListNode reverseList(ListNode head){
		ListNode temp = head;
		if (head==null){
			return head;
		}
		ListNode result_head = new ListNode(head.val, null);
		temp = temp.next;
		while (temp!=null){
			ListNode temp2 = new ListNode(temp.val, result_head);
			result_head = temp2;
			temp = temp.next;
		}
		return result_head;
	}
}
